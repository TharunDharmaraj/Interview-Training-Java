import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public static int connectRopes(int[] lengths, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i : lengths) {
            pq.add(i);
        }
        int minLength = 0, first = 0, second = 0;
        while (pq.size() > 1) {
            first = pq.peek();
            pq.poll();
            second = pq.peek();
            pq.poll();
            int min = first + second;
            minLength = minLength + min;
            pq.add(min);
        }
        return minLength;
    }
}