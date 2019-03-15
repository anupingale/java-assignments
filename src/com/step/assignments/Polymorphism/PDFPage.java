package com.step.assignments.Polymorphism;

public class PDFPage implements Display{
    @Override
    public void display(String content) {
        System.out.println(content);
    }
}
