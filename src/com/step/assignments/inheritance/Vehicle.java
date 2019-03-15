package com.step.assignments.inheritance;

public class Vehicle {
    private String type;
    private int speed;
    private int wheels;

    public Vehicle (String type, int speed,int wheels) {
        this.type = type;
        this.speed = speed;
        this.wheels = wheels;
    }

    public void increaseSpeed(int speed) {
        this.speed += speed;
    }
}
