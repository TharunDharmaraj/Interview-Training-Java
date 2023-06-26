package Maximum Product subarray;

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, product = 1;
        for(int i : nums){
            product *= i;
            max = Math.max(product,max);
            if(product == 0){
                product = 1;
            }
        }
        product = 1;
        for(int j = nums.length - 1; j >=0 ; j--){
            product *= nums[j];
            max = Math.max(product,max);
            if(product == 0){
                product = 1;
            }
        }
        return max;
    }
}
