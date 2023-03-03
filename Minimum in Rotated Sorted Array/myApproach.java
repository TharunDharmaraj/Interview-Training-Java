class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int changes = 0;
        for(int i:nums){
            if(i<min){
                min = i;
                changes++;
            }
            if(changes>2){
                break;
            }
        }
        return min;
    }
}