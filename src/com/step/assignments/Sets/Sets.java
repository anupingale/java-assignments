package com.step.assignments.Sets;

import java.util.HashSet;
import java.util.Set;

public class Sets<T> {
    private final Set<T> set;

    public Sets(Set set) {
        this.set = set;
    }

    public Set<T> union(Set set2) {
        Set<T> intersectedSet = new HashSet<>();
        intersectedSet.addAll(set);
        intersectedSet.addAll(set2);
        return intersectedSet;
    }

    public Set<T> intersection(Set set2) {
        Set<T> intersectedSet = new HashSet<>(set);
        intersectedSet.retainAll(set2);
        return intersectedSet;
    }

    public Set<T> difference(Set set2) {
        Set<T> intersectedSet = new HashSet<>(set);
        intersectedSet.removeAll(set2);
        return intersectedSet;
    }
}
