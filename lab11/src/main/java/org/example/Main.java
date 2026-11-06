package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Сборник стихов", "К. Там", 200);
        Novel novel = new Novel("Война и мир", "А. Малькевич", 1274, "Россия");
        Textbook textbook = new Textbook("Алгебра", "Е. Дедюля", 256, "Математика");
        book.read();
        book.read(25);
        book.read("Введение");
        System.out.println(book.getGenre());
        System.out.println(novel.getGenre());
        System.out.println(textbook.getGenre());
    }
}