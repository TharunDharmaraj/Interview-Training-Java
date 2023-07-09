package interviewBit;

import java.util.Scanner;

public class recFact {
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    // Iteration
    // public static void main(String[] args) {
    // int num = 10;
    // long factorialResult = 1l;
    // for (int i = 1; i <= num; ++i) {
    // factorialResult *= i;
    // }
    // System.out.println("Factorial: " + factorialResult);
    // }
}
