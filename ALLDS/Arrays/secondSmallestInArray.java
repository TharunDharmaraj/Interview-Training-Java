// Reference : https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
package ALLDS.Arrays;

public class secondSmallestInArray {
    public static void main(String[] args) {
        int arr[] = { 12, 13, 1, 10, 34 };
        print2Smallest(arr);
    }

    private static void print2Smallest(int[] arr) {
        if(arr.length < 2){
            System.out.println("Invalid Input!!!");
            return;
        }
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int i:arr){
            if(i <= first){ //Handle Duplicates
                second  = first;
                first = i;
            }
            if(second > i && first < i){
                second = i;
            }
        }
        if(second == Integer.MAX_VALUE){
            System.out.println("No 2nd Smallest number found!!!");
        }else{
        System.out.println("Second Smallest element is : " + second );
        }
    }
}
