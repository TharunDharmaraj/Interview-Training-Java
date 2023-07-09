package interviewBit;

public class recBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 7, 10, 12 };
        boolean search = binarySearch(arr, 0, arr.length - 1, 3);
        if (search == true) {
            System.out.println("Found");
        } else {
            System.out.println("Found");
        }
    }

    private static boolean binarySearch(int[] arr, int i, int j, int key) {
        int mid = (i + j) / 2;
        if (i > j) {
            return false;
        }
        if (arr[mid] == key) {
            return true;
        }

        if (key < arr[mid]) {
            return binarySearch(arr, i, mid - 1, key);
        }

        return binarySearch(arr, mid + 1, j, key);
    }

}
