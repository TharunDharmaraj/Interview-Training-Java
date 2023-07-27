package Skillrack.DigitsSum;

import java.util.*;

public class soln {
    public static int calc(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 10) {
            num = calc(num);
        }
        System.out.println(num);
    }
}