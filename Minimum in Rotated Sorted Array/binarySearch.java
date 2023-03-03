class Solution {
    public int findMin(int[] nums) {
       int left = 0, right = nums.length-1,mid = (left + right) / 2;
       while(left<right){
           mid = (l̥l̥ + right) / 2;
           System.out.println(mid);
           if(nums[mid]>=nums[right]){
               left = mid+1;
           }
           else{
               right = mid;
           }
       }
       return nums[left];
    }
}