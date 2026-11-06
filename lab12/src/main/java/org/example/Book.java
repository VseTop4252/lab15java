package org.example;

class Book {
    protected String title;
    protected int id;
    protected int pages;

    public Book(String title, int id, int pages) {
        this.title = title;
        this.id = id;
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "title=" + title + ", id=" + id + ", pages=" + pages;
    }
}