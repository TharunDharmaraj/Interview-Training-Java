class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        String[] arr = new String[26];
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        Arrays.fill(arr,"NO");
        for(int i = 0 ; i < pattern.length() ; i++){
            char ch = pattern.charAt(i);
            if(arr[ch - 97].equals("NO") && !hm.containsKey(words[i])){
                hm.put(words[i],1);
                arr[ch - 97] = words[i];
            }else if(!arr[ch - 97].equals(words[i])){
                return false;
            }
        }
        return true;
    }
}