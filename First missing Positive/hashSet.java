package First missing Positive;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> st = new HashSet<Integer>();
        for(int n : nums){
            st.add(n);
        }
        int max = 0;
        for(int j : st){
            if(j > max){
                max = j;
            }
        }
        for(int i = 1 ; i <= max ; i++){
            if(!st.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}