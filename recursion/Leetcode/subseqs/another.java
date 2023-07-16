class Solution {
    public static void printSubSeqs(int[] nums, ArrayList<Integer> al , int n , int len, List<List<Integer>> ans){
        if(n == len){
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[n]);
        printSubSeqs(nums,al,n+1,len,ans);
        al.remove(al.size()-1);
        printSubSeqs(nums,al,n+1,len,ans);
}

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        printSubSeqs(nums,al,0,nums.length,ans);
        return ans;
    } 
}