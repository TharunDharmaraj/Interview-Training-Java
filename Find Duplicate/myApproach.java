class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            int abs = Math.abs(nums[i]);
            if(nums[abs - 1] > 0){
                nums[abs - 1] *= -1;
                System.out.println(nums[abs - 1] + " " + i);
            }
            else{
                return abs;
            }
        }
        return 0;
    }
}