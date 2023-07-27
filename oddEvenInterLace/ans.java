package oddEvenInterLace;

import java.util.Scanner;

class ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp = num2;
        for (int i = num1; i <= num2; i += 2) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            } else {
                if (i < num2)
                    System.out.print((i + 1) + " ");
            }

            if (temp % 2 == 0) {
                System.out.print(temp + " ");
            } else {
                if (temp > num1)
                    System.out.print((temp - 1) + " ");
            }
            temp -= 2;
        }
    }
}