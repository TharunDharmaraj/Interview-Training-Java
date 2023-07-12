package threeSUm;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k] ;
                if(sum == target){
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    st.add(al);
                    j++;
                    k--;
                }
                else if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        List<List<Integer>> li = new ArrayList<>(st);
        return li;
    }
}