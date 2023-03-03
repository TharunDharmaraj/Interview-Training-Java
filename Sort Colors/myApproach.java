class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        for(int i=0;i < len ; i++){
            for(int j = len - 1 ; j > i ; j--){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}