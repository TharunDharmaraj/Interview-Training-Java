import java.util.*;
import java.io.*;

public class Solution {
    public static int findSmallestInteger(int[] arr) {
		int sum = 0;
		for(int num : arr){
			sum += num;
		}
		boolean[] bool = new boolean[sum+1];
		bool[0] = true;
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = sum ; j >= arr[i] ; j--){
				if(bool[j - arr[i]]){
					bool[j] = true;
				}
			}
		}
		for(int k = 0 ; k <= sum ; k++){
			if(!bool[k]){
				return k;
			}
		}
		return sum+1;
	}

}

// Time Complexity: O(n*sum), where n is length of array
// Auxiliary Space: O(sum)