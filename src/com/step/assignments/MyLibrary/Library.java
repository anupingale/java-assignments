package com.step.assignments.MyLibrary;

import java.util.*;

public class Library {
    private List<Book> books;
    private List<Reader> readers;
    private List<Book> removedBooks;

    private Map<String, ArrayList<String>> readerRegister;
    private Map<String,String> bookRegister;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
        this.readerRegister = new HashMap<>();
        this.removedBooks = new ArrayList<>();
        this.bookRegister = new HashMap<>();
    }

    public void addReader(Reader reader) {
        readers.add(reader);
        readerRegister.put(reader.getName(),new ArrayList<>());
    }

    public boolean hasBook(String bookName) {
        if(books.contains(getBook(bookName))){
            return true;
        }
        return false;
    }

    private Book getBook(String bookName) {
        for(Book book: books) {
            if(book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    private Reader getReader(String readerName) {
        for(Reader reader: readers) {
            if(reader.getName().equals(readerName)) {
                return reader;
            }
        }
        return null;
    }

    public void assignBook(String bookName, String readerName) {
        ArrayList<String> myBooks = readerRegister.get(readerName);
        bookRegister.put(bookName,readerName);
        myBooks.add(bookName);

        Book book = getBook(bookName);
        getReader(readerName).borrowBook(book);

        books.remove(bookName);
    }

    public void retrieveBook(String bookName, String readerName) {
        Book returnedBook = getReader(readerName).returnBook(bookName);
        books.add(returnedBook);

        ArrayList<String> books = readerRegister.get(readerName);
        books.removeIf(book -> book.equals(bookName));
        bookRegister.remove(bookName);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String bookName) {
        Book book = getBook(bookName);
        removedBooks.add(book);
        books.removeIf(book1 -> book1.getName().equals(bookName));
    }

    public String getBorrower(String bookName) {
        return bookRegister.get(bookName);
    }

    public ArrayList<String> getBooksBorrowedBy(String readerName) {
        return readerRegister.get(readerName);
    }
}
