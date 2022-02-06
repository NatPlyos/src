package com.company.Books;

import java.util.Arrays;

public class Bookshelf {

    private Book[] books;
    private int numberOfBooks;

    public Bookshelf(Book[] books, int numberOfBooks) {
        this.books = books;
        this.numberOfBooks = numberOfBooks;
    }

    public Bookshelf(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void addBook(Book book) {
        if (this.books.length + 1 > this.numberOfBooks) {
            System.out.println("There is no space on the shelf");
        } else {
            Book[] temp = new Book[books.length + 1];
            for (int i = 0; i < temp.length - 1; i++) {
                temp[i] = books[i];
            }
            temp[temp.length - 1] = book;
            books = temp;
        }
    }

    public void removeBook(Book book) {
        Book[] temp = new Book[books.length - 1];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (!books[i].getName().equals(book.getName())) {
                temp[j] = books[i];
                j++;
            }
            books = temp;
        }
    }

    public int countReadBooks() {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].readByMe) {
                count++;
            }
        }
        return count;
    }

    public int countBooks() {
        return books.length;
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + Arrays.toString(books) +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }
}
