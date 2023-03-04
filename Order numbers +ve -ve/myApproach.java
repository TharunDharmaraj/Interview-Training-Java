class Solution {
    public void segregateElements(int arr[], int n)
    {   
        int len = arr.length;
        int array[] = new int[len];
        int j= 0;
        for(int i:arr){
        if(i>0){
                array[j] = i;
                j++;
            }
        }
        if (j == len || j == 0)
            return;
        for(int i:arr){
            if(i<0){
                array[j] = i;
                j++;
            }
        }
        for(int i = 0; i< len ; i++){
            arr[i] = array[i];
        }
    }
}l̥