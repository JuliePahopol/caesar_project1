package org.example;
import java.util.Scanner;

public class EntryPoint {

    public static void main(String[] args) {

        System.out.println("Введите 1 , если хотите зашифровать текст \n Введите 2, если хотите дешифровать \n Введите 3 если необходимо взломать шифр методом подбора ключей : ");
        Scanner sc1 = new Scanner(System.in);
        String option = sc1.nextLine();

        FileManager fm = new FileManager();
        String data = fm.readFile();


        if (Integer.parseInt(option) == 1 || Integer.parseInt(option) == 2) {
            System.out.println("Введите ключ");
            int key = sc1.nextInt();


            if (key> 28) {
                System.out.println("Вы ввели неправильный ключ ");
                System.exit(0);
            }


            if (Integer.parseInt(option) == 1) {
                System.out.println("Шифрование");


                Encryptor encryptor = new Encryptor(key, data);

                String changed = encryptor.encrypt();
                System.out.println(changed);
                writeToFileFromConsole www = new writeToFileFromConsole();
                www.writeFile(changed);
                System.exit(0);
            }

            if (Integer.parseInt(option) == 2) {
                System.out.println("Дешифровка");

                Decrypt decryptor = new Decrypt(key, data);

                String changed = decryptor.decrypt();
                System.out.println(changed);
                writeToFileFromConsole www = new writeToFileFromConsole();
                www.writeFile(changed);
                System.exit(0);
            }
        }
        else if (Integer.parseInt(option) == 3) {
            System.out.println("Подбор ключей методом взлома ");
            bruteForce brute = new bruteForce(data);
            String changed = brute.bruteMe();
            System.out.println(changed);
            writeToFileFromConsole www = new writeToFileFromConsole();
            www.writeFile(changed);
            System.exit(0);
        }
    }
}