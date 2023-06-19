package PatternPrinitng;

import java.util.Scanner;

public class shopUp1 {
    public static void main(String[] args) {
        // Pattern printing program was given
        // Input : 3
        // Output :
        // 00000
        // 10001
        // 21012
        // 32123
        // Went on for 20 minutes
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int eachLine = (2 * num) - 1;
        int left = 0;
        for (int i = 0; i <= num; i++) {
            for (int k = left; k > 0; k--) {
                System.out.print(k);
            }
            for (int j = 0; j < eachLine; j++) {
                System.out.print(0);
            }
            for (int m = 1; m <= left; m++) {
                if(eachLine < 0 && m == 1){
                    continue;
                }
                System.out.print(m);
            }
            left++;
            eachLine = eachLine - 2;
            System.out.println();
        }
    }
}
