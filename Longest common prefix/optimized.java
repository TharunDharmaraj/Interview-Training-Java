class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String word1 = strs[0] ,word2 = strs[strs.length-  1];
        int len = word1.length(), i = 0, index = 0;;
        while(len>i){
            if(word1.charAt(i) == word2.charAt(i)){
                index++;
            }else{
                break;
            }i++;
        }
        return word1.substring(0,index);
    }
}