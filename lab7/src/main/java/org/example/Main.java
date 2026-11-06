package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Apartment a1 = new Apartment("ул. Ленина, 1", 2, 52.0);
        Apartment a2 = new Apartment("ул. Пушкина, 10", 3, 67.0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println();
        System.out.println();
        System.out.println("Всего квартир: " + Apartment.cnt);
        System.out.println("Общая площадь "+ Apartment.sum);
        System.out.println("Средняя площадь "+Apartment.getAverageArea());
    }
}
