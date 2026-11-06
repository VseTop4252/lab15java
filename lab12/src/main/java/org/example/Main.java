package org.example;

import java.util.*;

public class Main {
    static void main() {
        Map<String, Book> books = new HashMap<>();
        books.put("Мастер и Маргарита", new Novel("Мастер и Маргарита", 3, 480, "Круто"));
        books.put("История Рф", new Textbook("История Рф", 6, 560, "История"));
        books.put("Бэтмен: Год первый", new Comic("Бэтмен: Год первый", 7, 144, "Егор д"));
        for (String key : books.keySet()) {
            System.out.println(key + "x " + books.get(key));
        }
        System.out.println();
        System.out.println();
        System.out.println();
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(1, "Иван Жилинский", "Бег", "Новичок", List.of(5, 4, 4)));
        athletes.add(new Athlete(2, "Дедюля Егор", "Плавание", "Средний", List.of(2, 1, 3)));
        System.out.println("До:");
        athletes.forEach(System.out::println);
        Iterator<Athlete> it = athletes.iterator();
        while (it.hasNext()) {
            if (it.next().getAverageResult() < 3) it.remove();
        }
        System.out.println("После удаления avg < 3:");
        athletes.forEach(System.out::println);
        for (Athlete a : athletes) {
            if (a.getAverageResult() >= 4) a.setLevel(a.getLevel() + "+");
        }
        System.out.println("После повышения avg >= 4:");
        athletes.forEach(System.out::println);
        System.out.println("Спортсмены уровня 'Новичок+':");
        for (Athlete a : athletes) {
            if (Objects.equals(a.getLevel(), "Новичок+")) System.out.println(a);
        }
        athletes.add(new Athlete(2, "Дедюля Егор", "Плавание", "Средний", List.of(2, 3, 3)));
        athletes.add(new Athlete(3, "Педюля Егор", "Плавание", "Средний", List.of(2, 3, 3)));
        athletes.add(new Athlete(4, "Дедюля Егор", "Плавание", "Средний", List.of(2, 5, 3)));
        athletes.sort((a, b) -> {
            int cmp = Double.compare(b.getAverageResult(), a.getAverageResult());
            if (cmp != 0) return cmp; 
            return b.getName().compareTo(a.getName());
        });
        System.out.println("ID Имя Средний результат");
        for (Athlete a : athletes) {
            System.out.println(a.getId() + "  " + a.getName() + "  " + a.getAverageResult());
        }
    }
}