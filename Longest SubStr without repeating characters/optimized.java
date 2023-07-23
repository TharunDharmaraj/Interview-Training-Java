// https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/3649636/3-method-s-c-java-python-beginner-friendly/
package Longest SubStr without repeating characters;

//Array
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}

// Using hashmap
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxLength = 0;
//         Map<Character, Integer> charMap = new HashMap<>();
//         int left = 0;
        
//         for (int right = 0; right < n; right++) {
//             if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
//                 charMap.put(s.charAt(right), right);
//                 maxLength = Math.max(maxLength, right - left + 1);
//             } else {
//                 left = charMap.get(s.charAt(right)) + 1;
//                 charMap.put(s.charAt(right), right);
//             }
//         }
        
//         return maxLength;
//     }
// }




// Using set
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxLength = 0;
//         Set<Character> charSet = new HashSet<>();
//         int left = 0;
        
//         for (int right = 0; right < n; right++) {
//             if (!charSet.contains(s.charAt(right))) {
//                 charSet.add(s.charAt(right));
//                 maxLength = Math.max(maxLength, right - left + 1);
//             } else {
//                 while (charSet.contains(s.charAt(right))) {
//                     charSet.remove(s.charAt(left));
//                     left++;
//                 }
//                 charSet.add(s.charAt(right));
//             }
//         }
        
//         return maxLength;
//     }
// }
