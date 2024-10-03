package com.pluralsight.library;

public class Book {
    int id;
    String isbn;
    String bookTitle;
    boolean isCheckedOut;
    String checkedOutTo;

    public Book(int id, String isbn, String bookTitle, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    //Getters for book properties
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }
}
