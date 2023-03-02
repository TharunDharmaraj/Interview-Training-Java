import java.io.*;

class optimal {

	static void printTwoElements(int arr[], int size)
	{
        for(int i = 0 ; i < size ; i++){
            int abs_val = Math.abs(arr[i]);
            if(arr[abs_val - 1] >= 0){
                arr[abs_val - 1] *= -1;
            }
            else{
                System.out.println("Repeating Number: "+ abs_val);
            }
        }
        for(int j = 0 ;j < size; j++){
            if(arr[j] > 0){
                System.out.println("Missing Number:"+arr[j]);
                break;
            }
        }
		
	}

	public static void main(String[] args)
	{
            int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
            int n = arr.length;
            printTwoElements(arr, n);
	}
}

