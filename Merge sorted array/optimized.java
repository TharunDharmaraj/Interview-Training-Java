// Link : https://leetcode.com/problems/merge-sorted-array/solutions/3037315/fully-explained-java-code-with-approach-in-o-m-n-time/?languageTags=java


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1 , k = m+n-1;
        while( j  >= 0 ){
            if( i>=0 && nums1[i] > nums2[j] ){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }      
    }
}