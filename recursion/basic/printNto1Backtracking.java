package recursion.basic;

public class printNto1Backtracking {
    public static void main(String[] args) {
        printN1(10);
    }

    private static void printN1(int i) {
        if(i == 0){
            return;
        }
        printN1(--i);
        System.out.println(i); // BACKTRACKING
    }
}
