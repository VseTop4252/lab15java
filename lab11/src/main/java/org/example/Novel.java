package org.example;

public class Novel extends Book {
    private String setting;

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public Novel(String title, String author, int pages, String setting) {
        super(title, author, pages);
        this.setting = setting;
    }

    @Override
    public String getGenre() {
        return "Роман";
    }
    @Override
    public String toString() {
        return "Роман [\"" + title + "\", " + author + ", " + pages + " стр., место действия: " + setting + "]";
    }
}
