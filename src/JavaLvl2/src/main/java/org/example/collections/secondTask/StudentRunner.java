package org.example.collections.secondTask;

import org.example.collections.secondTask.comparators.AgeComparator;
import org.example.collections.secondTask.comparators.AvgGradeComparator;
import org.example.collections.secondTask.comparators.NameSurnameComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Artem", "Lebedev", 27, 3.4),
                new Student("Oleg", "Olegov", 34, 4.3),
                new Student("Zema", "Zemov", 95, 95.95),
                new Student("Sin", "Sobaki", 13, 0.5));

        Student studentWithMaxAvgGrade = StudentUtils.getStudentWithMaxAvgGrade(students);
        System.out.println(studentWithMaxAvgGrade);
        System.out.println();
        System.out.println(students);
        students.sort(new NameSurnameComparator());
        System.out.println(students);
        students.sort(new AgeComparator());
        System.out.println(students);
        students.sort(new AvgGradeComparator());
        System.out.println(students);

    }

}
