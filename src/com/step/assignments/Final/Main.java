package com.step.assignments.Final;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(1900,"Mustakim");
        Student s1 = new Student(2000,"Swapnil");
        Student s2 = new Student(1800,"Sapana");
        Student s3 = new Student(2900,"Anu");
        List<Student> students = asList(s, s1, s2, s3);
        for (Student student : students) {
            System.out.println(student.getDetails());
        }
    }
}
