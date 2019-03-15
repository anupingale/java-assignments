package com.step.assignments.generic;

public class UnoCard implements Duplicable<DuplicateUnoCard> {
    private String name;
    private String symbol;

    public UnoCard(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public DuplicateUnoCard duplicate() {
        return new DuplicateUnoCard(this.name, this.symbol);
    }
}
