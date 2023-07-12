class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length + 3];
        Arrays.fill(dp,0);
        int prev = 0;
        for(int i = 0 ; i < nums.length ; i++){
            dp[i+3] += Math.max(prev, nums[i]+ Math.max (dp[i+1] , dp[i]));
            prev = dp[i+3];
        }
        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }
}