package org.example;

public class Main {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("Poco X6 Pro Max Dark Brawl Stars Edition", 50);
        Smartphone phone2 = new Smartphone("iPhone 15", 0);
        Smartphone phone3 = new Smartphone("Samsung S24", 80);

        Laptop laptop1 = new Laptop("Honor MagicBook", 30, 15.6);
        Laptop laptop2 = new Laptop("Lenovo ThinkPad", 60, 14.0);

        System.out.println();
        phone1.turnOn();
        phone2.turnOn();
        phone3.turnOn();
        laptop1.turnOn();
        laptop2.turnOn();

        System.out.println();
        System.out.println();
        phone1.charge();
        phone2.charge();
        phone3.charge();
        laptop1.charge();
        laptop2.charge();

        System.out.println();
        System.out.println();
        phone1.turnOn();
        phone2.turnOn();
        phone3.turnOn();
        laptop1.turnOn();
        laptop2.turnOn();
    }
}