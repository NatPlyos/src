package com.company.Books;

public class Book {
    protected boolean readByMe; // почему если делают private, поле становится не доступным в методе countReadBooks в классе Bookshelf??
    protected String author;
    protected String name;
    protected int pagesAmount;


    public Book(String author, String name, int pagesAmount) {
        this.author = author;
        this.name = name;
        this.pagesAmount = pagesAmount;
        this.readByMe = false;
    }

    public String getAuthor() { return author; }

    public String getName() { return name; }

    public int getPagesAmount() { return pagesAmount; }

    public void setAuthor(String author) { this.author = author; }

    public void setName(String name) { this.name = name; }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }


    public void read() {
        this.readByMe=true;
        }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pagesAmount=" + pagesAmount +
                ", readByMe=" + readByMe +
                '}';
    }
}
