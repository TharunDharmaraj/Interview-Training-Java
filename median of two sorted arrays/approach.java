package median of two sorted arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int k = n+m;
        int[] nums = new int[k];
        int index = 0;
        int left = 0 , right = 0;
        while(left < n && right < m){
            if(nums1[left] <= nums2[right]){
                nums[index++] = nums1[left++];
            }else{
                nums[index++] = nums2[right++];
            }
        }
        while(left < n){
            nums[index++] = nums1[left++];
        }
        while(right < m){
            nums[index++] = nums2[right++];  
        }
        double median;
        int mid =k/2;
         if(k%2==0){
            median = (nums[mid] + nums[mid-1])/2.0;
        }
        else{
            median = nums[mid];
        }
        return median;
    }
}