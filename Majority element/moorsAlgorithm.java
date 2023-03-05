// Ref link: https://leetcode.com/problems/majority-element/solutions/3015428/c-moore-s-voting-algorithm-explained-in-super-simple-fast-way/?languageTags=java
class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0 , freq = 0;
        for(int i : nums){
            if(freq == 0){
                ans = i;
                freq++;
            }else if(ans == i){
                freq++;
            }else{
                freq--;
            }
        }
        return ans;
    }
}