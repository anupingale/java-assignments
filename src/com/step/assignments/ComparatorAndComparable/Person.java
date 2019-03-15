package com.step.assignments.ComparatorAndComparable;

public class Person implements Comparable<Person> {
    private String name;
    private int accountBalance;
    private int id;

    public Person(String name, int accountBalance,int id) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.id = id;
    }

    @Override
    public int compareTo(Person o) {
        return this.accountBalance - o.accountBalance;
    }

    public String getDetails() {
        return "name is : " + this.name +"\n" + "balance is : " + this.accountBalance+"\n";
    }

    public int getId() {
        return this.id;
    }
}
