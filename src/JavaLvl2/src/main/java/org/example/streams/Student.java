package org.example.streams;

import org.example.streams.enums.Course;
import org.example.streams.enums.Grades;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private Course course;
    private List<Grades> gradesList;

    public Student(String name, String surname, Course course, List<Grades> gradesList) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.gradesList = gradesList;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Course getCourse() {
        return course;
    }

    public List<Grades> getGradesList() {
        return gradesList;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && course == student.course && Objects.equals(gradesList, student.gradesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course, gradesList);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", gradesList=" + gradesList +
                '}';
    }
}
