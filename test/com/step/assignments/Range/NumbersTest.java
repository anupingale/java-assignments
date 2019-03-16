package com.step.assignments.Range;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersTest {
    @Test
    void shouldReturnRangeOfNumbers() {
        Numbers numbers = new Numbers();
        numbers.getAll(1,10);
        assertEquals(numbers.list,new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
    }

    @Test
    void shouldCheckNumbersArePrinted() {
        Numbers numbers = new Numbers();
        numbers.getAll(1,5);
    }
}