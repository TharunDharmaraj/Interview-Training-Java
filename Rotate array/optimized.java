class Solution {
    public void reverse(int[] arr, int low , int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len = nums.length -1;
        reverse(nums, 0, len);
        System.out.println(Arrays.toString(nums));
        reverse(nums,0, k - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, k , len );
        System.out.println(Arrays.toString(nums));
    }
}