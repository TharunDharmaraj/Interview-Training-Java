// Reference: https://www.geeksforgeeks.org/non-repeating-element/
package ALLDS.Arrays;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 9, 4,6, 9, 6, 7, 4 };
        int n = arr.length;
        System.out.println(firstNonRepeating(arr, n));
    }

    private static int firstNonRepeating(int[] arr, int n) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i : arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        for(int j : arr){
            if(hm.get(j)==1){
                return j;
            }
        }
        return 0;
    }
}
