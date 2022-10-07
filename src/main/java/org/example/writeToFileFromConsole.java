package org.example;

import java.io.*;
import java.util.Scanner;

public class writeToFileFromConsole {

    public String writeFile(String outputData) {
        System.out.println("Введите без кавычек путь к файлу в который хотите записать данные :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next(); //вводим в консоль путь к файлу
        File file = new File(path);

        StringBuilder sb = new StringBuilder();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            if (file.exists()) {
                bw.write(String.valueOf(outputData));
                if (outputData != null) {
                    bw.close();

                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex);

        }
        return sb.toString();
    }

}