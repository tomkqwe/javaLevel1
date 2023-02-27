package org.example.collections.secondTask;

import java.util.Iterator;
import java.util.List;

public final class StudentUtils {
    private StudentUtils() {
    }
    public static Student getStudentWithMaxAvgGrade(List<Student> list){
        Iterator<Student> iterator = list.iterator();
        Student bestStudent = null;
        while (iterator.hasNext()){
            Student next = iterator.next();
            if (bestStudent == null || next.getAvgGrade() > bestStudent.getAvgGrade()){
                bestStudent = next;
            }
        }
        return bestStudent;
    }
}
