class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mapp = new HashMap<>();
        for(int i:nums){
            if(!mapp.containsKey(i)){
                mapp.put(i,1);
            }else{
                mapp.put(i,mapp.get(i)+1);
            }
            //remove if else and use:
            //    mapp.put(i, mapp.getOrDefault((mapp.get(i)+1),0));
        }
        int largest = 0,value,count,highestValue= 0;
        for(Map.Entry<Integer,Integer> i: mapp.entrySet()){
            count = i.getValue();
            if(count > nums.length / 2){
                highestValue = i.getKey();
                return highestValue;
            }
            if(count > largest){
                largest = count;
                highestValue = i.getKey();
            }
        }
        return highestValue;
    }
}