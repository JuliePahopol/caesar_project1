package org.example;

public class Decrypt {

    public Decrypt(int key, String data, String alphabet) {

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < data.length(); i++) {

                if (data.charAt(i) == ' ') {
                    result.append(' ');
                    continue;
                }

                int position = alphabet.indexOf(data.charAt(i));
                try {
                    result.append(alphabet.charAt(position - key));
                } catch (StringIndexOutOfBoundsException e) {
                   continue;
                }
            }
        }
    }


