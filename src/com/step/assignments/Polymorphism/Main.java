package com.step.assignments.Polymorphism;

public class Main {
    public static void main(String[] args) {
        NonInteractiveWebPage n = new NonInteractiveWebPage();
        PDFPage p = new PDFPage();
        WebPage w = new WebPage();
        String message = "Content to be displayed";
        n.display(message);
        p.display(message);
        w.display(message);
    }
}
