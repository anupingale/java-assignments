package com.step.assignments.sort;

import java.util.ArrayList;

public class QuickSort {
    private ArrayList<Integer> sortedList;

    public void createTree(ArrayList<Integer> numbers) {
        int pivot = numbers.remove(numbers.size());

        ArrayList<Integer> lesser = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();


        for (int i = 0; i < numbers.size()-1; i++) {
            if(numbers.get(i) > pivot) {
                greater.add(numbers.get(i));
            }
            lesser.add(numbers.get(i));
        }
        if(lesser.size() == 1) {
            sortedList.add(lesser.get(0));
        }
        if(lesser.size() > 1) {
            createTree(lesser);
        }
        if(greater.size() == 1) {
             sortedList.add(greater.get(0));
        }
        if(greater.size() > 1) {
            createTree(greater);
        }
    }

    public ArrayList<Integer> getList() {
        return this.sortedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        QuickSort s = new QuickSort();
        s.createTree(numbers);
        System.out.println(s.getList());
    }
}
