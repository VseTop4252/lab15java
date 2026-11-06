package org.example;

import java.io.*;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("f.txt"))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                bw.write(Integer.toString(sc.nextInt()));
                bw.newLine();
            }
        }

        int tmp = 0;
        System.out.print("Числа из файла: ");
        try (BufferedReader br = new BufferedReader(new FileReader("f.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                System.out.print(n + " ");
                if (n % 2 == 0) tmp++;
            }
        }
        System.out.println("Количество чётных чисел: " + tmp);
    }
}
