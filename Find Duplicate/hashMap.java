class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> duplicate = new HashMap<Integer,Integer>();
       for(int i:nums){
           if(duplicate.containsKey(i)){
               return i;
           }else{
               duplicate.put(i,1);
           }
       }
       return 0;
    }
}