class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int[] arr = new int[len];
        for(int i = 0; i < len ; i++){
            if(i == 0){
                arr[i] = nums[i];
            }
            else{
                arr[i] = Math.max(nums[i],arr[i-1]+nums[i]);
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}