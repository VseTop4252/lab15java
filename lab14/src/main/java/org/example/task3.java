package org.example;

import java.io.*;
import java.util.Random;

public class task3 {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();

        try (BufferedWriter f = new BufferedWriter(new FileWriter("f.txt"))) {
            for (int i = 0; i < 15; i++) {
                f.write(Integer.toString(rnd.nextInt(100)));
                f.newLine();
            }
        }
        try (BufferedReader fr = new BufferedReader(new FileReader("f.txt")); BufferedWriter g  = new BufferedWriter(new FileWriter("g.txt")); BufferedWriter h  = new BufferedWriter(new FileWriter("h.txt")))
        {
            String line;
            while ((line = fr.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                if (n % 4 == 0) {
                    g.write(n + "\n");
                } else {
                    h.write(n + "\n");
                }
            }
        }
    }
}
