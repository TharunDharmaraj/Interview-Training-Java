package ALLDS.Arrays;

import java.util.Scanner;

public class operations {
    public static int[] arr = new int[100];
    static int n = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.println("Enter " + (i + 1) + " th element: " + arr[i]);

        }
        insertPos(6, 2);
        deletePos(6);
        searchVal(3);
        updatePosVal(3, 10);
    }

    public static void insertPos(int value, int pos) {
        if (pos >= n) {
            System.out.println("Cannot be inserted");
            return;
        }
        n++;
        for (int j = n - 1; j >= pos; j--) {
            arr[j] = arr[j - 1];
        }
        arr[pos - 1] = value;
        System.out.println("Aftyer Insertion :");
        printArray();
    }

    public static void deletePos(int pos) {
        if (pos > n) {
            System.out.println("Cannot be Deleted");
            return;
        }
        for (int j = pos - 1; j < n; j++) {
            arr[j] = arr[j + 1];
        }
        n--;
        System.out.println("Aftyer Deletion :");
        printArray();
    }

    public static void printArray() {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " th element: " + arr[i]);
        }
    }

    private static void searchVal(int value) {
        for (int j = 0; j < n; j++) {
            if (arr[j] == value) {
                System.out.println(value + " Found at positiopn " + (j + 1));
                return;
            }
        }
        System.out.println("Value " + value + " Not found !!!");
    }

    private static void updatePosVal(int pos, int val) {
        if (pos >= n) {
            System.out.println("Updateion Cannot be performed!!!");
            return;
        }
        arr[pos - 1] = val;
        printArray();
    }
}
