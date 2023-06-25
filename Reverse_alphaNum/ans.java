package Reverse_alphaNum;

import java.util.Scanner;

// Given a sentence containing many words you have to reverse all the alphanumeric characters in each and every word of the sentence.
// Input:  "my ^&na$me@#$ is123 Mike"
// Output: "ym ^&an$em@#$ 321si ekiM"

class ans {
    public static void reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.print(rev);
    }

    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        String str = "my na$me@#$ is123 Mike@";
        int start = 0, end = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                end++;
            } else {
                if (start != end) {
                    reverse(str.substring(start, end));
                    System.out.print(ch);
                }else {
                    System.out.print(ch);
                }
                start = i + 1;
                end = i + 1;
            }
        }
        System.out.println();
        System.out.println(str);
    }
}
