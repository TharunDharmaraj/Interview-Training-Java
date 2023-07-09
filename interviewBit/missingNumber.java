//  Given an array of non-duplicating numbers from 1 to n where one number is missing, write an efficient java program to find that missing number.

package interviewBit;

public class missingNumber {
    public static void main(String[] args) {
        int[] array = { 4, 3, 8, 7, 5, 2, 6 };
        int missingNumber = findMissingNum(array);
        System.out.println("Missing Number is " + missingNumber);
    }

    private static int findMissingNum(int[] array) {
        int len = array.length + 1;
        int totalSum = (len * (len+1) )/ 2;
        int thisSum = 0;
        for(int i : array){
            thisSum += i;
        }
        return totalSum - thisSum;
    }
}
