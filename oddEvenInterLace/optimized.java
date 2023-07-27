package oddEvenInterLace;

import java.util.Scanner;

class optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i, j;
        for (i = a, j = b; i <= b; i++, j--) {
            if (i % 2 == 1)
                System.out.print(i + " ");
            if (j % 2 == 0)
                System.out.print(j + " ");
        }
    }
}
