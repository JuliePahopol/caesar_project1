package org.example;

public class BruteForce {
    private String data;
    private int key;
    private final String alphabet;

   public BruteForce(int key, String data){
       this.key = key;
       this.data = data.toLowerCase();
       this.alphabet = "abcdefghigklmnopqrstuvwxyz,&*(:'$#@!.?/|- ";

   }
    public String bfMethod() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < this.data.length(); i++) {
            if (data.charAt(i) == ' ') {
                result.append(' ');
                continue;
            }
            if (key< data.length()){
                key++;
            }

            try {
                int position = alphabet.indexOf(data.charAt(i));
                result.append(alphabet.charAt(position - key++));
            }catch (NullPointerException e){
                System.out.println(result);
            }
        }
        return result.toString();
    }
//        try {
//        for (int i = 0; i < data.length(); i++) {
//            if (data.charAt(i) == ' ') {
//                result.append(' ');
//                continue;
//            }
//            int position = alphabet.indexOf(data.charAt(i));
//
//            for (this.key = 0; this.key < this.alphabet.length(); this.key++) {
//                result.append(alphabet.charAt(position - key));
//            }
//        }
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println(result);
//        }
//        return String.valueOf(result);
//    }
}
//        for (int i = 0; i < this.data.length(); i++) {
//            int position = alphabet.indexOf(data.charAt(i));
//
//            try {
//                if (this.key < this.alphabet.length()) {
//                    this.key++;
//                    result.append(alphabet.charAt(position - this.key));
//                }
//            } catch (StringIndexOutOfBoundsException e) {
//                continue;
//            }
//        }
//        System.out.println(result);
//        return String.valueOf(result);
//    }
//}

