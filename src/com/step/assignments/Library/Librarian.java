package com.step.assignments.Library;

import java.util.List;
import java.util.Map;

public class Librarian extends Library{
    private String name;
    private Library library;

    public Librarian(String name,Library library) {
        this.name = name;
        this.library = library;
    }

    public void addBookToLibrary(String name) {
        library.addBook(name);
    }

    public void removeBookFromLibrary(String name) {
        library.removeBook(name);
    }

    public Map bookInteractions() {
        return library.interactions();
    }

    public List borrowedLibraryBooks() {
        return library.borrowedBooks();
    }
}
