package com.step.assignments.MyLibrary;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        Book let_us_c = new Book("Let us C");
        Book java = new Book("Thinking in java");

        Reader anu = new Reader("anu");
        Reader keerthy = new Reader("keerthy");

        myLibrary.addBook(let_us_c);
        myLibrary.addBook(java);

        myLibrary.addReader(anu);
        myLibrary.addReader(keerthy);

        myLibrary.assignBook("Thinking in java","anu");
        System.out.println(myLibrary.getBorrower("Thinking in java"));
        System.out.println(myLibrary.getBooksBorrowedBy("anu"));
        myLibrary.retrieveBook("Thinking in java","anu");
        System.out.println(myLibrary.hasBook("Let us C"));
        myLibrary.removeBook("Let us C");
    }
}
