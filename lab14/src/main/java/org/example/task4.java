package org.example;
import java.io.*;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("light.txt"))) {
            System.out.println("Введите 12 значений освещённости:");
            for (int i = 0; i < 12; i++) {
                bw.write(Double.toString(sc.nextDouble()));
                bw.newLine();
            }
        }
        double sum = 0;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("light.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line.trim());
                count++;
            }
        }
        System.out.println("Средняя освещённость: " + (sum / count));
    }
}