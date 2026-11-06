package org.example;
import java.io.*;

public class Main {
    static void main() throws IOException {
        String hobby = "Моё хобби это игра в компьютерную игрушку дота 2";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("hobby.txt"))) {
            bw.write(hobby);
        }

        File f = new File("hobby.txt");
        System.out.println("Имя файла " + f.getName());
        System.out.println("Путь " + f.getAbsolutePath());
        System.out.println("Размер " + f.length());
        System.out.println("Последнее изменение " + f.lastModified());
        System.out.println("Существует " + f.exists());
        System.out.println("Чтение " + f.canRead());
        System.out.println("Запись " + f.canWrite());

        System.out.println("Содержимое файла ");
        try (BufferedReader br = new BufferedReader(new FileReader("hobby.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
