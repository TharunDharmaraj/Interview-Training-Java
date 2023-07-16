// Link: https://www.youtube.com/watch?v=AxNNVECce8c&list=RDCMUCJskGeByzRRSvmOyZOz61ig&index=4
package recursion.intermediate;

import java.util.ArrayList;

public class allSubsequence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> subSeqs = new ArrayList<>();
        printSubSeq(arr, subSeqs, 0, arr.length);
    }

    private static void printSubSeq(int[] arr, ArrayList<Integer> subSeqs, int n, int len) {
        if (n == len) {
            System.out.println(subSeqs);
            return;
        }
        subSeqs.add(arr[n]);
        printSubSeq(arr, subSeqs, n + 1, len);
        subSeqs.remove(subSeqs.size() - 1);
        printSubSeq(arr, subSeqs, n + 1, len);
    }
}
