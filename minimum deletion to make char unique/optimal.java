// Link: https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/solutions/2207106/c-easy-solution-full-explanation-least-space/
class Solution {
    public int minDeletions(String str) {
        int count = 0;
		int[] nums = new int[26];
        Arrays.fill(nums,0);
        for(int i = 0 ; i < str.length() ; i++){
            char word = str.charAt(i);
            nums[word - 'a']++;
        }
        Arrays.sort(nums);
        for(int i = 24 ; i >= 0 ; i--){
            if(nums[i] == 0){
                break;
            }
            if(nums[i] >= nums[i+1]){
                int prev = nums[i];
                nums[i] = Math.max(0,nums[i+1] - 1);
                count += prev - nums[i];
            }
        }
		return count;
    }
}