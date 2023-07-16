class Solution {
    public static List<List<Integer>> printSubSeqs(int[] nums, ArrayList<Integer> al , int n , int len, List<List<Integer>> ans){
        if(n == len){
            ans.add(new ArrayList<>(al));
            return ans;
        }
        al.add(nums[n]);
        printSubSeqs(nums,al,n+1,len,ans);
        al.remove(al.size()-1);
        printSubSeqs(nums,al,n+1,len,ans);
        return ans;
}

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        return printSubSeqs(nums,al,0,nums.length,ans);
    } 
}