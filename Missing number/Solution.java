class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length ;
        int total = (len * (len + 1)) / 2;
        for(int i : nums){
            total -= i;
        }
        return total;
    }
}