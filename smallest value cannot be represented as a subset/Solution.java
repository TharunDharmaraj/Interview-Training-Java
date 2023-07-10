package smallest value cannot be represented as a subset;

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSmallestInteger(int[] arr) {
		int n = arr.length;
		int ans = 1;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i = 0 ; i < n ; i++){
			if(arr[i] > ans){
				return ans;
			}else{
				ans += arr[i];
			}
		}
		return ans;
	}
}