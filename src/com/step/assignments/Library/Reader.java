package com.step.assignments.Library;

import java.util.HashSet;
import java.util.Set;

public class Reader {
    private String name;
    private int id;
    private Set<String> books = new HashSet<>();
    private Library library;

    public Reader(String name, int id, Library library) {
        this.name = name;
        this.id = id;
        this.library = library;
    }

    public void getBook(String name) {
        if (library.hasBook(name)) {
            books.add(library.getBookForUser(name, this.name));
        }
    }

    public boolean searchBook(String name) {
        return library.hasBook(name);
    }

    public void returnBook(String name) {
        books.remove(name);
        library.removeBookFromUser(name);
    }

    public boolean isAlreadyBorrowed(String name) {
        return books.contains(name);
    }
}
