
class Compute {
    
    public void Rearrange(long arr[], long n)
    {
        int i = 0, j = 0;
        int len = (int)n;
        while(i < len){
            if(arr[i] >= 0){
                i++;
            }else{
                for(int k = i; k > j ; k--){
                    long temp = arr[k];
                    arr[k] = arr[k -1];
                    arr[k - 1] = temp;
                }
                i++;
                j++;
            }
        }
        
    }
}