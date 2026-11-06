package org.example;

public class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int pages, String subject) {
        super(title, author, pages);
        this.subject = subject;
    }

    @Override
    public String getGenre() {
        return "Учебник";
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Учебник [" + title + ", " + author + ", " + pages + " стр., предмет: " + subject + "]";
    }
}