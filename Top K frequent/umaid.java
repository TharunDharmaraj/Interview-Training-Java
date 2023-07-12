package Top K frequent;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else {
                hm.put(i,1);
            }
        }
        int arr[] = new int[hm.size()];
        int j=0;
        for(int i:hm.keySet()){
            arr[j++] = hm.get(i);
        }
        int p = 0;
        Arrays.sort(arr);
        j = arr.length-1;
        int res[] = new int[k];
        while(k>0){
            for(int i:hm.keySet()){
                if(hm.get(i)==arr[j]){
                    res[p++] = i;
                    j--;
                    k--;
                    hm.remove(i);
                    break;
                }
            }
        }
        return res;
    }
}