package org.example;
public class Encryptor {

    private int key;
    private String data;
    private final String alphabet;
    private int position;

    public Encryptor(Integer key, String data) {
        this.key = key;
        this.data = data.toLowerCase();
        this.alphabet = "abcdefghigklmnopqrstuvwxyz,&*(:'$#@!.?/|- ";
    }

    public String encrypt() {
        StringBuilder result = new StringBuilder();
        this.position = 0;
        for (int i = 0; i < this.data.length() - 1; i++) {

            if (this.data.charAt(i) == ' ') {
                result.append(' ');
                continue;
            }

            this.position = this.alphabet.indexOf(this.data.charAt(i));
            result.append(this.alphabet.charAt(this.position + this.key));
        }
        return result.toString();
    }
}