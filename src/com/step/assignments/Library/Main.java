package com.step.assignments.Library;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library1 = new Library();
        Reader reader1 = new Reader("anu", 1, library1);
        Librarian librarian1 = new Librarian("librarian", library1);
        librarian1.addBookToLibrary("a");
        librarian1.addBookToLibrary("b");
        librarian1.addBookToLibrary("c");
        System.out.println(reader1.searchBook("a"));
        reader1.getBook("a");
        reader1.getBook("b");
        System.out.println(reader1.isAlreadyBorrowed("a"));
        librarian1.removeBookFromLibrary("c");
        List l = librarian1.borrowedLibraryBooks();
        for (Object o : l) {
            System.out.println(o);
        }
        reader1.returnBook("a");
        Map booklist = librarian1.bookInteractions();
        System.out.println(booklist.toString());
    }
}
