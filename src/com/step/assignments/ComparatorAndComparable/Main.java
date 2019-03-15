package com.step.assignments.ComparatorAndComparable;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Person p2 = new Person("Rinku",1000,1);
        Person p3 = new Person("Priyanka",1323,2);
        Person p1 = new Person("anu",10000,3);
        List<Person> people = asList(p1, p2, p3);
        for (Person person : people) {
            System.out.println(person.getDetails());
        }
        Collections.sort(people,new PersonComparator());
        for (Person person : people) {
            System.out.println(person.getDetails());
        }
     }
}