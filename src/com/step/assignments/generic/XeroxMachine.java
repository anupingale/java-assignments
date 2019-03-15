package com.step.assignments.generic;

public class XeroxMachine  {
    public static < O extends Duplicable<D>, D> D getDuplicate(O original){
        return original.duplicate();
    }

    public static void main(String[] args) {
        XeroxMachine.getDuplicate(new UnoCard("sdf", "Sdf"));
    }
}
