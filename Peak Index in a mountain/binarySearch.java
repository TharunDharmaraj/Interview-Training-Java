package Peak Index in a mountain;
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1, mid = 0;
        while(left < right){
            mid = left + (right - left) / 2;
            if(arr[mid] > arr[mid + 1]){
                right = mid; 
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}