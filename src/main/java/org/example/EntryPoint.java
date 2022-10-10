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


            encrypt_decrypt ce = new encrypt_decrypt(key,data);

            if (Integer.parseInt(option) == 1) {

                System.out.println("Шифрование:");
                String changed = ce.encrypt();
                System.out.println(changed);
                writeToFileFromConsole www = new writeToFileFromConsole();
                www.writeFile(changed);
                System.exit(0);
            }
            if (Integer.parseInt(option) == 2) {

                System.out.println("Дешифровка");
                String changed = ce.decrypt();
                System.out.println(changed);
                writeToFileFromConsole www = new writeToFileFromConsole();
                www.writeFile(changed);
                System.exit(0);

            }  if (Integer.parseInt(option)==3) {
                System.out.println("brute force method ");
                String bruteForce= ce.decrypt();
                System.out.println(bruteForce);
                writeToFileFromConsole www = new writeToFileFromConsole();
                www.writeFile(bruteForce);
                System.exit(0);
//                bruteForce bf1 = new bruteForce(data);
//                String bfValue = bf1.bfMethod();
//                System.out.println(bfValue);
//                System.exit(0);

            }

        }
    }
}

