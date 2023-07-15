package recursion.basic;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverse(arr, 0, arr.length - 1);     
        reverse(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    //Two Pointer
    private static void reverse(int[] arr, int i, int j) {
        if (i > j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i + 1, j - 1);
    }

    //Single variable
    private static void reverse(int[] arr, int i) {
        if (i > arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverse(arr, i + 1);
    }
}
