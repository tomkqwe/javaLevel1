package org.example.streams;

import org.example.streams.enums.Course;
import org.example.streams.enums.Grades;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class StudentUtil {
    private StudentUtil() {
    }

    /**
     * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
     */
    public static Map<Course, Double> getCourseAndAverageGrade(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGradesList().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.mapping(Student::getGradesList, Collectors.collectingAndThen(Collectors.toList(), StudentUtil::getAvgGradesCourse))));
    }

    public static Double getAvgGradesCourse(List<List<Grades>> lists) {
        return lists.stream()
                .flatMap(a -> a.stream().map(Grades::getValue))
                .mapToInt(value -> value)
                .average()
                .orElse(0.0);
    }
    public static Double getAvgGradesStudents(List<Grades> lists){
        return lists.stream()
                .map(Grades::getValue)
                .mapToInt(a->a)
                .average()
                .orElse(0.0);
    }

    /**
     * Список студентов данного курса, но только с полями Имя и Фамилия.
     * Список должен быть отсортированы по этим двум полям
     */
    public static Map<Course, List<FullNameStudent>> getFullNameStudents(List<Student> students) {
        Map<Course, List<FullNameStudent>> collect = students.stream().collect(Collectors.groupingBy(Student::getCourse,
                Collectors.mapping(a -> new FullNameStudent(a.getName(), a.getSurname()), Collectors.toList())));
        sortByNameAndSurname(collect);
        return collect;

    }

    private static void sortByNameAndSurname(Map<Course, List<FullNameStudent>> collect) {
        collect.forEach((key, value) -> value.sort(Comparator.comparing(FullNameStudent::getName)
                .thenComparing(FullNameStudent::getSurname)));
    }

    /**
     * Объект с двумя полями:
     * - Отсортированный список студентов с пункта 2
     * - Средняя оценка этих студентов
     */
    public static Map<Course,List<StudentsAndAvgGrade>> getStudentsFullNameAndAvgGrade(List<Student> students){
        Map<Course, List<StudentsAndAvgGrade>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.mapping(a -> new StudentsAndAvgGrade(getFullNameStudents(students).get(a.getCourse()),
                                getAvgGradesStudents(a.getGradesList())), Collectors.toList())));

        collect.forEach((course, studentsAndAvgGrades) -> studentsAndAvgGrades.stream()
                .map(a->a.getStudents().stream().sorted(Comparator.comparing(FullNameStudent::getName).thenComparing(FullNameStudent::getSurname))));

        return collect;
    }


}
