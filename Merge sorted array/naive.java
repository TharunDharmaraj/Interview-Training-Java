class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i = m ; i < m + n ; i++){
            nums1[i] = nums2[j++];
        }
        for(int i = 0 ; i < m+n ; i++){
            for(j = m+n-1 ; j > i ; j--){
                if(nums1[j] < nums1[j - 1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                }
            }
        }        
    }
}