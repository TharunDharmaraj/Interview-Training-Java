package longest sub arr of 1;

class Solution {
    public int longestSubarray(int[] nums) {
        int maximum = 0, ones = 0, zeros = 0, right = 0, left = 0, len = nums.length;
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        while(right < len){
            if(nums[right] == 1){
                ones++;
                right++;
            }else{
                al.add(ones);
                right++;
                ones=0;
            }
        }
        al.add(ones);
        if(ones == len){
            return len - 1;
        }
        int sum = 0;
        for(int i = 1 ; i < al.size() ; i++){
            sum = al.get(i) + al.get(i -1);
            maximum = Math.max(sum,maximum);
        }
        return maximum;
    }
}