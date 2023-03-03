package org.example.streams;

import org.example.streams.enums.Course;
import org.example.streams.enums.Grades;

import java.util.*;

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Artem", "Lebedev", Course.SECOND, Arrays.asList(Grades.A, Grades.A));
        Student student12 = new Student("Abrtem", "Lebedev", Course.SECOND, Arrays.asList(Grades.A, Grades.A,Grades.C));
        Student student13 = new Student("Artem", "Bebedev", Course.SECOND, Arrays.asList(Grades.A, Grades.A,Grades.C,Grades.C,Grades.C,Grades.C));
        Student student2 = new Student("Semen", "Semenov", Course.THIRD, Arrays.asList(Grades.B, Grades.C, Grades.D, Grades.E, Grades.A));
        Student student3 = new Student("Ivan", "Ivanov", Course.FOURTH, Arrays.asList(Grades.B, Grades.B, Grades.B, Grades.E, Grades.A));
        Student student4 = new Student("Dim", "Dimich", Course.FIRST, Arrays.asList(Grades.A, Grades.B, Grades.B, Grades.A, Grades.A));
        Student student5 = new Student("Tema", "Temkina", Course.THIRD, Arrays.asList(Grades.E, Grades.C, Grades.E));

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5,student12,student13));

        Map<Course, Double> courseAndAverageGrade = StudentUtil.getCourseAndAverageGrade(students);
        System.out.println(courseAndAverageGrade);

        Map<Course, List<FullNameStudent>> fullNameStudents = StudentUtil.getFullNameStudents(students);
        System.out.println(fullNameStudents);

        Map<Course, List<StudentsAndAvgGrade>> studentsFullNameAndAvgGrade = StudentUtil.getStudentsFullNameAndAvgGrade(students);
        System.out.println(studentsFullNameAndAvgGrade);


    }
}
