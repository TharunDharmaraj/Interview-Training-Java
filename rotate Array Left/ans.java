package rotate Array Left;
// Link :https://practice.geeksforgeeks.org/problems/quick-left-rotation3806/1
// Input: N = 7, K = 2
// arr[] = {1, 2, 3, 4, 5, 6, 7}
// Output: 3 4 5 6 7 1 2
// Explanation: Rotation of the above 
// array by 2 will make the output array .
class Solution
{
    void reverse(int start, int end, long[] arr){
        while(start < end){
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    void leftRotate(long arr[], int k,int n)
    {
        k = k % n;
        reverse(0,n-1,arr);
        reverse(0,n - k - 1 , arr);
        reverse(n-k, n-1,arr);
    }
}