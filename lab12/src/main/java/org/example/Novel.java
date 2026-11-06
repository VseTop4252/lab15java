package org.example;

class Novel extends Book {
    private String genre;

    public Novel(String title, int id, int pages, String genre) {
        super(title, id, pages);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "title=" + title + ", id=" + id + ", pages=" + pages + ", genre=" + genre;
    }
}