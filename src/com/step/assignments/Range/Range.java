package com.step.assignments.Range;

public interface Range<T> {
    public void getAll(T start, T end);
    public boolean contains(T element);
}
