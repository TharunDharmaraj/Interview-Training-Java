package Skillrack.Pattern.p1;
import java.util.Scanner;
public class hash_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = 0; j < n; j++) {
                if (k >= 1) {
                    System.out.print("*");
                    k--;
                    continue;
                }
                if (i == j) {
                    System.out.print("#");
                }
                if (i != j) {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
