package org.example.collections.secondTask.comparators;

import org.example.collections.secondTask.Student;

import java.util.Comparator;

public class AvgGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getAvgGrade(), o1.getAvgGrade());
    }
}
