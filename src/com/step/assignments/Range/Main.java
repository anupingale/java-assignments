package com.step.assignments.Range;

public class Main {
    public static void main(String[] args) {
       Alphabets a = new Alphabets();
       a.getAll('a','z');
       System.out.println(a.contains('l'));
       Numbers n = new Numbers();
       n.getAll(1,100);
        System.out.println(n.contains(10));
    }
}
