package recursion.intermediate;

import java.util.ArrayList;

public class subseqSumK {
    public static void main(String[] args) {
            int[] arr = { 1, 2, 3 };
            ArrayList<Integer> subSeqs = new ArrayList<>();
            printSubSeq(arr, subSeqs, 0, arr.length,3);
    }

    private static void printSubSeq(int[] arr, ArrayList<Integer> subSeqs, int n, int len, int k) {
        if (n == len) {
            if(sum(subSeqs) == k){
                System.out.println(subSeqs);
            }
            return;
        }
        subSeqs.add(arr[n]);
        printSubSeq(arr, subSeqs, n + 1, len,k);
        subSeqs.remove(subSeqs.size() - 1);
        printSubSeq(arr, subSeqs, n + 1, len,k);
    }

    private static int sum(ArrayList<Integer> subSeqs) {
        int sum =0 ;
        for(int i : subSeqs){
            sum+=i;
        }
        return sum;
    }
}
