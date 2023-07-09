package interviewBit;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int j = str.length() - 1;
        int i = 0;
        char[] rev = new char[j+1];
        while (i <= j) {
            rev[j] = str.charAt(i);
            rev[i] = str.charAt(j);
            j--;
            i++;
        }
        System.out.println(String.valueOf(rev));
    }
}
