package com.step.assignments.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println();
        int numbers[] = {1,4,6,2,7,3};
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < i; i1++) {
                if (numbers[i] > numbers[i1]) {
                    int temp;
                    temp = numbers[i];
                    numbers[i] = numbers[i1];
                    numbers[i1] = temp;
                }
            }
//            System.out.println(i + " " +numbers[i]);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
