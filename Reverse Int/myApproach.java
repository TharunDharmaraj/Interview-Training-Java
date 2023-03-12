class Solution {
    public int reverse(int x) {
        long rev = 0, digit = 0;
        while(x != 0 ){
            digit = x % 10;
            x = x / 10 ; 
            rev = rev * 10 + digit;
        }
        if(rev >= Integer.MAX_VALUE || rev <= Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}