package org.example;

import java.io.*;
import java.util.Random;

public class task5 {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("f.txt"))) {
            for (int i = 0; i < 10; i++) {
                bw.write(Integer.toString(rnd.nextInt(100)));
                bw.newLine();
            }
        }
        int odd = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("f.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                if (n % 2 != 0) odd++;
            }
        }
        System.out.println("Количество нечётных: " + odd);
    }
}