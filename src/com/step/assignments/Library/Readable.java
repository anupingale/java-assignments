package com.step.assignments.Library;

public interface Readable {
    public boolean hasBook(String name);
    public String getBookForUser(String name, String reader);
    public void removeBookFromUser(String name);
}
