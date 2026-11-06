package org.example;

public interface Readable {
    void read();
    void read(int pages);
    void read(String chapter);

    static String getReadingHint() {
        return "Чтение развивает мышление";
    }
}
