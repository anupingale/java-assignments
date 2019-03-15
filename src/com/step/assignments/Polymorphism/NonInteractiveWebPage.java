package com.step.assignments.Polymorphism;

public class NonInteractiveWebPage implements Display {
    @Override
    public void display(String content) {
        System.out.println(content);
    }
    public String click() {
        return "Clicking is not allowed";
    }
}
