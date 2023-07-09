// Write a Java Program to check if any number is a magic number or not. A number is said to be a magic number if after doing sum of digits in each step and inturn doing sum of digits of that sum, the ultimate result (when there is only one digit left) is 1.
// Example, consider the number:

// Step 1: 163 => 1+6+3 = 10
// Step 2: 10 => 1+0 = 1 => Hence 163 is a magic number

package interviewBit;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumOfDigit = 0;
        while(number > 0){
            int digit = number % 10;
            sumOfDigit += digit;
            number = number / 10;
            if(number == 0){
                if(sumOfDigit > 9){
                    number = sumOfDigit;
                    sumOfDigit = 0;
                }
            }
        }
        if(sumOfDigit == 1){
            System.out.println("Magic Number");
        }else{
            System.out.println("Not Magic Number");
        }
    }
}
