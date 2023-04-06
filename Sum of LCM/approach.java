import java.util.* ;
import java.io.*; 
public class Solution {
	public static int gcd(int a, int b){
		if(b == 0){
			return a;
		}else{
			return gcd(b,a%b);
		}
	}

	public static int lcm(int a, int b){
		return a*b/gcd(a,b);
	}

	public static long lcmSum(long n) {
		int num = (int)n;
		long thisSum = 0;
		for(int j = 1;j <= num ; j++){
			thisSum += lcm(j,num);		
		}
		return thisSum;
    }
}