package com.step.assignments.sort;

public class DesendingOrder {
    public void desendingOrder(int[] numbers) {
     for(int i=0; i<numbers.length-1;i++) {
         int temp;
         if(numbers[i] < numbers[i+1]) {
            temp = numbers[i+1];
            numbers[i+1] = numbers[i];
            numbers[i] = temp;
             System.out.println(numbers[i]);
         }
     }
    }
}
