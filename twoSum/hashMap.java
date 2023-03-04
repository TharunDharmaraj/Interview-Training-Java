class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length,a = 0 , b = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i],i);
            }else{
                a = i;
                b = map.get(target - nums[i]);
                break;
            }
        }
        return new int[] {a,b};
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2];
//         int len = nums.length;
//         Map<Integer,Integer> arr = new HashMap<Integer,Integer>();
//         for(int  i =0 ;i<len;i++){
//             if(arr.containsKey(target - nums[i])){
//                 ans[0] = i;
//                 ans[1] = arr.get(target - nums[i]);
//                 return ans;
//             }
//             arr.put(nums[i],i);
//         }
//         return ans;
//     }
// }