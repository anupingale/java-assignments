package com.step.assignments.Switch;

import java.util.Scanner;

public class SwitchAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character = sc.next();
        sc.close();

        switch (character) {
            case "A" :
                System.out.println("This is the first character.");
                break;
            case "B" :
                System.out.println("This is the second character.");
                break;
            default:
                System.out.println("Unexpected input.");
        }
    }
}
