package com.step.assignments.Sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Set<Integer> numbers2 = new HashSet<Integer>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(5);
        numbers2.add(6);
        Sets mySets = new Sets(numbers);
        System.out.println("union is : " + mySets.union(numbers2));
        System.out.println("difference is : " + mySets.difference(numbers2));
        System.out.println("intersectionis : " +mySets.intersection(numbers2));
    }
}
