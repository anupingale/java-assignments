package com.step.assignments.Range;

import java.util.ArrayList;

public class Alphabets implements Range<Character>{
    ArrayList<Character> list;

    public Alphabets() {
        this.list = new ArrayList<>();
    }

    @Override
    public void getAll(Character start, Character end) {
     for (char i = start; i <= end; i++) {
         list.add(i);
     }
     for (Character character : list) {
            System.out.println(character);
     }
    }

    @Override
    public boolean contains(Character element) {
        return list.contains(element);
    }
}
