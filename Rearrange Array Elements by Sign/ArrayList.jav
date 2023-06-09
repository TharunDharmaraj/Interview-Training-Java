class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> alPos = new ArrayList<Integer>();
        ArrayList<Integer> alNeg = new ArrayList<Integer>();
        for(int i : nums){
            if(i >= 0){
                alPos.add(i);
            }else{
                alNeg.add(i);
            }
        }
        int pos = 0, neg = 0;
        for(int i =0; i < nums.length ; i++){
            if(i%2 == 0){
                    ans[i] = alPos.get(pos);
                    pos++;
            }else{
                    ans[i] = alNeg.get(neg);
                    neg++;
            }
        }
        return ans;
    }
}