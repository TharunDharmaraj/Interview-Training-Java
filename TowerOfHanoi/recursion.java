package TowerOfHanoi;

import java.util.*;


// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
    public long toh(int N, int from, int to, int aux) {
        long num = 0;
        if(N>0){
            num = 0;
            num+=toh(N-1,from,aux,to);
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            num++;
            num+=toh(N-1,aux,to,from);
        }
        return num;
    }
}
 



class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            //taking input N
            N = sc.nextInt();
            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}