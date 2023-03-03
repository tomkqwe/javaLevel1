package org.example.streams;

import java.util.List;
import java.util.Objects;

public class StudentsAndAvgGrade {
    private List<FullNameStudent> students;
    private Double avgGrade;

    public StudentsAndAvgGrade(List<FullNameStudent> students, Double avgGrade) {
        this.students = students;
        this.avgGrade = avgGrade;
    }

    public List<FullNameStudent> getStudents() {
        return students;
    }

    public Double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsAndAvgGrade that = (StudentsAndAvgGrade) o;
        return Objects.equals(students, that.students) && Objects.equals(avgGrade, that.avgGrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, avgGrade);
    }

    @Override
    public String toString() {
        return "StudentsAndAvgGrade{" +
                "students=" + students +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
