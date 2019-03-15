package com.step.assignments.PrimeNumbers;

import java.util.ArrayList;

public class Primes {
    private int lastNumber;
    ArrayList<Integer> primeList = new ArrayList<Integer>();

    public Primes(int lastNumber) {
        this.lastNumber = lastNumber;
    }

    private boolean isPrime(int number) {
        for(int i = 2; i < number -1; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void primeTill() {
        for(int i = 2; i <= lastNumber; i++) {
            if(isPrime(i)) {
               primeList.add(i);
            }
        }
    }

    public ArrayList<Integer> getPrimes() {
        primeTill();
        return primeList;
    }

    public static void main(String[] args) {
        Primes p = new Primes(1000);
        System.out.println(p.getPrimes());
    }
}
