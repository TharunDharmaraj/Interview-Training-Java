// Reference: https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
package ALLDS.Arrays;

public class rearrangePosNeg {
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        rearrange(arr, n);
        System.out.println("Array after rearranging: ");
        printArray(arr, n);
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    private static void rearrange(int[] arr, int n) {

    }
}
