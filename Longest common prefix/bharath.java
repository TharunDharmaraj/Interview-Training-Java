class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        int len = word.length();
        for(int i = 1 ; i < strs.length ; i++){
            while(strs[i].indexOf(word) != 0){
                word = word.substring(0,len--);
            }
            if(word.length() == 0){
                break;
            }
        }
        return word;
    }
}