package org.example;
import java.io.*;
import java.util.Scanner;


public class FileManager {


    public String readFile() {
        System.out.println("Введите путь к файлу без кавычек :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        File file = new File(path);

        StringBuilder sb = new StringBuilder();

        try (FileReader reader = new FileReader(file)) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

                sb.append(line).append("\n");

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex);

        }
        return sb.toString();


    }

}
