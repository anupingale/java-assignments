package com.step.assignments.abstractMethods;

public class Lion extends Animals {

    @Override
    public void move() {
        System.out.println("Lion moves.");
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();
    }
}
