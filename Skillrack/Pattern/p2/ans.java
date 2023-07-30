package Skillrack.Pattern.p2;

import java.util.Scanner;

public class ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0 ; i < num ; i++){
            for(int j = 0 ; j < num ; j++){
                if( i == j || j == 0 || j == num - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
