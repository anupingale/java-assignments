package com.step.assignments.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List numbers;
    private static int currentIndex = -1;

    public ListIterator(List numbers) {
        this.numbers = numbers;
    }

    public boolean hasNext() {
        if (this.numbers.size() > this.currentIndex) {
            return true;
        }
        return false;
    }

    public int next() {
        if(hasNext()) {
            currentIndex++;
            return (int) numbers.get(currentIndex);
        }
        throw new NoSuchElementException();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ListIterator l = new ListIterator(numbers);
        l.hasNext();

        System.out.println(l.next());
        System.out.println(l.next());
        System.out.println(l.next());
        System.out.println(l.next());


    }
}

