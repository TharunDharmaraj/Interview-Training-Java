class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int negIndex = 1, posIndex = 0;
        for(int i = 0 ; i < len ; i++){
            if(nums[i] > 0){
                ans[posIndex] = nums[i];
                posIndex+=2;
            }
            else{
                ans[negIndex] = nums[i];
                negIndex+=2;
            }
        }
        return ans;
    }
}