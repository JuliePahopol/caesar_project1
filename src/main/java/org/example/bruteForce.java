package org.example;

public class bruteForce {
    private final String alphabet;

    private String data;

    public bruteForce(String data) {
        this.alphabet = "abcdefghijklmnopqrstuvwxyz,&*(:'$#@!.?/|- ";
        this.data = data.toLowerCase();
    }

    public String bruteMe() {
        for (int key = 0; key < this.alphabet.length(); key++) {
            Decrypt decrypted = new Decrypt(key, data);
            String decrypted_data = decrypted.decrypt();


            if ((decrypted_data.contains(", ") && decrypted_data.contains(" ") && decrypted_data.contains(". ") && decrypted_data.contains("o"))) {
                return decrypted_data;
            }
        }
        return null;
    }
}
