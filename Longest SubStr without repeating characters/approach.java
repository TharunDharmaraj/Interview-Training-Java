package Longest SubStr without repeating characters;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int len = 0, max = 0;
        for(int i  = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!hm.containsKey(ch)){
                len++;
                hm.put(ch,i);
            }else{
                i = hm.get(ch) + 1;
                max = Math.max(max,len);
                len = 1;
                hm.clear();
                hm.put(s.charAt(i), i);
            }
        }
        max = Math.max(max,len);
        return max;
    }
}
