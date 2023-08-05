import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class practise {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int largest = 0;
       String answer="";
       for(int i = 0 ; i< num; i++){
            String[] str = sc.next().split(",");
            int score = Integer.parseInt(str[1]);
            if(score > largest){
                largest = score;
                answer = str[0];
            }
       }
       System.out.println(answer);
    }
}

