class approach {
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

    //  public void Rearrange(int a[], int n)
    // {
    //       int arr[]=new int[n];
    //     int s=0;
    //     for( int i=0; i<n; i++)
    //     {
    //         if(a[i]<0){
    //         arr[s]=a[i];
    //         s++;}
    //     }
      
    //     for( int i=0; i<n; i++)
    //     {
    //         if(a[i]>=0){
    //         arr[s]=a[i];
    //         s++;}
    //     }
    //     for( int i=0; i<n; i++)
    //     {
    //        a[i]=arr[i];
    //     }
    // }
}