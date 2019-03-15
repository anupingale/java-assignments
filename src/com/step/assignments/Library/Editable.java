package com.step.assignments.Library;

import java.util.List;
import java.util.Map;

public interface Editable {
    public void addBook(String name);

    public void removeBook(String name);

    public Map interactions();

    public List borrowedBooks();
}
