package remove Duplicate From Sorted Array II;
// Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/solutions/3741215/simple-two-pointer-approach-tc-o-n/
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len <= 2){
            return len;
        }
        int rIndex = 1;
        for(int i = 2 ; i < len ; i++){
            if((nums[i] == nums[rIndex]) && (nums[i] == nums[rIndex - 1])){
                continue;
            }
            nums[++rIndex] = nums[i];
        }
        // int k = 0;
        // for(int j : nums){
        //     if(k <= rIndex + 1){
        //         System.out.print(j + " ");
        //         k++;
        //     }
        // }
        return rIndex + 1;
    }
}