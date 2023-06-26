package Product except self;

public class solution {
    static int[] productExceptSelf(int[] nums){
        //  O(N)
        int n = nums.length;
        int countZeroes = 0;
        int indexZero = -1;
        int productWithoutZero = 1;
        
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] == 0) {
                countZeroes++;
                indexZero = i;
            }
            else {
                productWithoutZero *= nums[i];
            }
        }
        
        int [] output = new int [n];
        if(countZeroes == 0) {
            for(int i = 0 ; i < n ; i++) {
                output[i] = productWithoutZero / nums[i];
            }
        }
        else if(countZeroes == 1) {
            output[indexZero] = productWithoutZero;
        }
        return output;
    }
    
}
