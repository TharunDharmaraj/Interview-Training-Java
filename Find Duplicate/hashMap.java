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

// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//             if(map.get(nums[i])==2){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }