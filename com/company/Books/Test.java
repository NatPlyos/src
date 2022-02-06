package com.company.Books;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Autor1", "Book1", 200);
        Book[] books = new Book[1];
        books[0] = book;

        Bookshelf bookshelf = new Bookshelf(5);
        bookshelf.setBooks(books);
        System.out.println(bookshelf);

        Book book1=new Book("Author2", "Book2",100);
        bookshelf.addBook(book1);
        System.out.println(bookshelf);
        System.out.println(bookshelf.countBooks());
        book1.read();
        System.out.println(bookshelf.countReadBooks());
    }
}
