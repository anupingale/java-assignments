package com.step.assignments.Library;

import java.util.*;

public class Library implements Editable,Readable{
    private static Set<String> books = new HashSet<>();
    private static Set<String> removedBooks = new HashSet<>();
    private static Map<String, String> borrowedBooks = new HashMap<>();

    public boolean hasBook(String name) {
        if (books.contains(name)) {
            return true;
        }
        return false;
    }

    public String getBookForUser(String name, String reader) {
        borrowedBooks.put(name, reader);
        return name;
    }

    public void removeBookFromUser(String name) {
        borrowedBooks.remove(name);
        books.add(name);
    }

    @Override
    public void addBook(String name) {
        books.add(name);
    }

    @Override
    public void removeBook(String name) {
        removedBooks.add(name);
        books.remove(name);
    }

    @Override
    public Map interactions() {
        return borrowedBooks;
    }

    @Override
    public List borrowedBooks() {
        ArrayList<String> names = new ArrayList<>();
        for ( String book: borrowedBooks.keySet()) {
            names.add(book);
        }
        return names;
    }

}
