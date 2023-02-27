package org.example.collections.secondTask.comparators;

import org.example.collections.secondTask.Student;

import java.util.Comparator;

public class NameSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
