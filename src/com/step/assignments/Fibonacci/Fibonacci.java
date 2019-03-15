package com.step.assignments.Fibonacci;

public class Fibonacci {
    private static int sum = 0;
    private int counter = 0;
    private int till;

    public Fibonacci(int till) {
        this.till = till;
    }

    public int getFibo(int firstnumber, int secondnumber) {
        if(till < counter) {
            return this.sum;
        };
        counter++;
        sum = firstnumber + secondnumber;
        return getFibo(secondnumber,sum);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci(9);
        System.out.println(f.getFibo(0,1));
    }
}
