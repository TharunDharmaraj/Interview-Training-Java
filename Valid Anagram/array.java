package Valid Anagram;
class array {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[60];
        Arrays.fill(arr,0);
        for(int i = 0 ; i < s.length(); i++){
            arr[s.charAt(i)-65] += 1; 
        }
        for(int i = 0 ; i < t.length(); i++){
            arr[t.charAt(i)-65] -= 1; 
        }
        for(int i : arr){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}