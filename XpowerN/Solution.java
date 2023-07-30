// Link: https://leetcode.com/problems/powx-n/solutions/3807721/2-optimised-method-bit-recursion-video-explanation-faster-log-n-solution/
package XpowerN;
class Solution {
    public double solve(double x , int n){
        if(n == 0){
            return 1;
        }
        double temp = solve(x,n/2);
        temp = temp * temp;
        if(n % 2 == 0){
            return temp;
        }else{
            return temp * x;
        }
    }
    public double myPow(double x, int n) {
        double ans = solve(x,n);
        if(n < 0){
            return 1/ans;
        }else{
            return ans;
        }
    }
}