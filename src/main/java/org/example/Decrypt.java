package org.example;

public class Decrypt {
    private int key;
    private String data;
    private final String alphabet;
    private int position;

    public Decrypt(Integer key, String data) {
        this.key = key;
        this.data = data.toLowerCase();
        alphabet =  "abcdefghijklmnopqrstuvwxyz,&*(:'$#@!.?/|- ";

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




