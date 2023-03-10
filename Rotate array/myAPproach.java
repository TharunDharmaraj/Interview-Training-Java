class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int right = len  - k;
        System.out.print("[");
        for(int i = right; i < len ; i++){
            System.out.print(nums[i]+",");
        }
        for(int i = 0; i< right ; i++){
            System.out.print(nums[i]);
            if(i != right-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}