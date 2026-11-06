package org.example;

public class Book implements Readable, Classifiable {
    protected String title;
    protected String author;
    protected int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void read() {
        System.out.println("Читаю книгу \"" + title + "\"");
    }

    @Override
    public void read(int pages) {
        System.out.println("Читаю " + pages + " страниц книги \"" + title + "\"");
    }

    @Override
    public void read(String chapter) {
        System.out.println("Читаю главу \"" + chapter + "\" книги \"" + title + "\"");
    }

    @Override
    public String getGenre() {
        return "Неизвестный жанр";
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Книга [" + title + ", " + author + ", " + pages + " стр., жанр: " + getGenre() + "]";
    }
}