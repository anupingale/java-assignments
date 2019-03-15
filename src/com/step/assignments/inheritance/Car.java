package com.step.assignments.inheritance;

public class Car extends Vehicle{
    private String company;
    private String owner;

    public Car(String type, int speed, int wheels, String company, String owner) {
        super(type, speed, wheels);
        this.company = company;
        this.owner = owner;
    }

    public void buy() {
        System.out.println(this.owner + " bought "+ this.company);
    }
}
