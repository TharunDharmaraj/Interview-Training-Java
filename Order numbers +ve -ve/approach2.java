class Solution {
    public void segregateElements(int arr[], int n)
    {   
        int i = 0, j = 0;
        while(i<n){
            if(arr[i]<0){
                i++;
            }
            else{
                for(int  k = i ; k >j ; k--){
                    int temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }
                i++;
                j++;
            }
        }
    }
}

Note: Runtime exceeded