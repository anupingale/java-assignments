package com.step.assignments.cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c = new Cylinder(1.5,2);
        assertEquals(14.137166941154069,c.getVolume());
    }

    @Test
    void getVolume() {
        Cylinder c = new Cylinder(1.5,2);
        assertEquals(7.0685834705770345,c.getArea());
    }
}