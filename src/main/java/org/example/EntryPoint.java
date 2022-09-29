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
            Scanner scanKey = new Scanner(System.in);
            int key = scanKey.nextInt();


            if (key > 26) {
                System.out.println("Вы ввели неправильный ключ ");
                System.exit(0);
            }


            CaesarEnryptor1 ce = new CaesarEnryptor1(key, data);
            if (Integer.parseInt(option) == 1) {

                System.out.println("Шифрование:");
                System.out.println(ce.encrypt());
                System.exit(0);
            }
            if (Integer.parseInt(option) == 2) {

                System.out.println("Дешифровка");
                System.out.println(ce.decrypt());
                System.exit(0);

            }
//        CaesarEnryptor1 ce = new CaesarEnryptor1(0, data );
            if (Integer.parseInt(option) == 3) {

                System.out.println("Взлом шифра с помощью подбора ключей");
                System.out.println(ce.BruteForce());
                System.exit(0);
            }

        }
    }
}
