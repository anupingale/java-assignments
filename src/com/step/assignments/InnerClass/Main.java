package com.step.assignments.InnerClass;

public class Main {
    public static void main(String[] args) {
        Notebook n = new Notebook("classmate");
        Notebook.Lines l = n.new Lines(100);
        Notebook.Lines l1 = n.new Lines(200);
        l.addLines(10);
        System.out.println(l.giveLines());
        System.out.println(l1.giveLines());
    }
}
