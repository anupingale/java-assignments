package com.step.assignments.MyLibrary;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> borrowedBook;

    public Reader(String name) {
        this.name = name;
        this.borrowedBook = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBook.add(book);
    }

    public Book returnBook(String bookName) {
        Book requiredBook = null;
        for (Book book:borrowedBook) {
            if(book.getName().equals(bookName)) {
                requiredBook = book;
                break;
            }
        }
        borrowedBook.remove(requiredBook);
        return requiredBook;
    }

    public String getName() {
        return this.name;
    }
}
