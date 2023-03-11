class Solution {
    public int[] runningSum(int[] nums) {
        int running  = 0;
        for(int i = 0 ; i < nums.length ; i++){
            running += nums[i];
            nums[i] = running;
        }
        return nums;
    }
}