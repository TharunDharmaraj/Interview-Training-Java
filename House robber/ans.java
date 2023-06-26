package House robber;

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int prev1 = 0, prev2 = 0;
        for(int i : nums){
            int temp = prev1;
            prev1 = Math.max(prev2+i, prev1);
            prev2 = temp;
        }
        return prev1;
    }
}

