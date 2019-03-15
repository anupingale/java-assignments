package com.step.assignments.generic;

public class DuplicateCard<T> {
    private T card;

    public DuplicateCard(T card) {
        this.card = card;
    }

    public T getDuplicate() {
        return this.card;
    }
}
