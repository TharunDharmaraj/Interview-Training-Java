class Solution {
    public int minStartValue(int[] nums) {
        int lastNeg = 0;
        int sum = 0 ;
        for(int i : nums){
            sum += i;
            if(i < 0){
                lastNeg = Math.min(lastNeg,sum);
            }
        }
        return 1 - lastNeg;
    }
}