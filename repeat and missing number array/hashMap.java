import java.util.*;
class hashMap{
    public static void printTwoElements(int[] arr, int size){
        HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>(); 
        //For finding repeating element
        for(int i=0;i<size;i++){
            if(hm.get(arr[i]) == null){
                hm.put(arr[i],true);
            }
            else{
                System.out.println("Repeating Element: "+ arr[i]);
            }
        }
        //For finding Missing element
        for(int i=1;i<=size;i++){
            if(hm.get(i) == null){
                System.out.println("Missing Element: "+ i);
            }
        }
    }
    public static void main(String[] args){
		int arr[] = { 7, 3, 4, 5, 5, 6, 2,1,9 };
		int n = arr.length;
		printTwoElements(arr, n);    
    }
}