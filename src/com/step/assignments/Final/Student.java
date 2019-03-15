package com.step.assignments.Final;

public class Student {
    private static String college = "Govt. Polytechnic Pune.";
    private final int fees;
    private String name;

    public Student(int fees, String name) {
        this.fees = fees;
        this.name = name;
    }

    public String getDetails() {
        return "Name : " + name +"\nFees : "+fees+"\n"+ "College : " +college+"\n";
    }
}
