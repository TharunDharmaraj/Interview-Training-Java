class Solution {
    public void sortColors(int[] nums) {
        int left = 0 , right = nums.length - 1 , mid = 0 ;
        while(mid<=right){
            System.out.println(nums[mid]);
            switch(nums[mid]){
                case 0:{
                    int temp =  nums[mid];
                    nums[mid] = nums[left];
                    nums[left] = temp;
                    left++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp =  nums[mid];
                    nums[mid] = nums[right];
                    nums[right] = temp;
                    right--;
                    break;
                }
            }
        }
    }
}