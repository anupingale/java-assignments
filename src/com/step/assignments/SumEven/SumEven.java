package com.step.assignments.SumEven;

import java.util.ArrayList;
import java.util.Scanner;

public class SumEven {
    private int sum = 0;
    private boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }

    public void addEvensTill(ArrayList<Integer> list, int lastNumber) {
        int count = 0;
        for (Integer number : list) {
            if(isEven(number) && count < lastNumber) {
                this.sum = this.sum + number;
                count++;
            }
        }
    }

    public int getSum() {
        return this.sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        SumEven s = new SumEven();
        s.addEvensTill(numbers,2);
        System.out.println(s.getSum());
    }
}
