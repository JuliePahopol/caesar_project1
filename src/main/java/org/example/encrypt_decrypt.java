package org.example;

public class encrypt_decrypt {
    private int key;
    private String data;
    private final String alphabet;
    private int position;

    public encrypt_decrypt(Integer key, String data) {
        this.key = key;
        this.data = data.toLowerCase();
        this.alphabet = "abcdefghigklmnopqrstuvwxyz,&*(:'$#@!.?/|- ";
    }


    public String encrypt() {
        StringBuilder result = new StringBuilder();
        this.position = 0;
        for (int i = 0; i < this.data.length(); i++) {

            if (this.data.charAt(i) == ' ') {
                result.append(' ');
                continue;
            }

            this.position = this.alphabet.indexOf(this.data.charAt(i));
            result.append(this.alphabet.charAt(this.position + this.key));
        }
        return result.toString();
    }

    public String decrypt() {
        StringBuilder result = new StringBuilder();
        int position;
        for (int i = 0; i < this.data.length(); i++) {

            if (this.data.charAt(i) == ' ') {
                result.append(' ');
                continue;
            }

            position = this.alphabet.indexOf(this.data.charAt(i));
            try {
                result.append(this.alphabet.charAt(position - this.key));
            } catch (StringIndexOutOfBoundsException e) {
                continue;
            }
        }
        return result.toString();
    }

}
