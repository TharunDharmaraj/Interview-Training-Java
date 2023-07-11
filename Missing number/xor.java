class Solution {
    public int missingNumber(int[] nums) {
        int x = 0, i;
        for(i = 0 ; i < nums.length ; i++){
            x ^= nums[i];
            x ^= i;
        }
        x ^= i;
        return x;
    }
}

// XOR is self-inverse. This means, any number XOR'ed with itself evaluates to 0. a ^ a = 0.