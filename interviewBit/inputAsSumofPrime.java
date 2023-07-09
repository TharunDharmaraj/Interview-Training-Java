package interviewBit;

import java.util.Scanner;

// Write a java program to check if any number given as input is the sum of 2 prime numbers.
// Example :

// Input - 18

// Output - 

// 18 = 13 + 5
// 18 = 11 + 7
public class inputAsSumofPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                if (isPrime(num - i)) {
                    System.out.println(num + " = " + (num - i) + " " + i);
                }
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
