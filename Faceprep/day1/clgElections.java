package Faceprep.day1;

import java.util.Scanner;
import java.util.*;

class clgElections {
    public static void main(String[] args) {
        int largest = 0, key = 0;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        while (sc.hasNextInt() != false) {
            int num = sc.nextInt();
            if (!hm.containsKey(num)) {
                hm.put(num, 1);
            } else {
                hm.put(num, hm.get(num) + 1);
            }
            int value = hm.get(num);
            if (value > largest) {
                largest = value;
                key = num;
            }
        }
        System.out.println(hm);
        System.out.println("WINNER: " + key);
    }
}