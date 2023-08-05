import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class practise {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int avg1 = 0, avg2 = 0;
        for (int i = 0; i < num; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String ans = br.readLine();
            // System.out.println(ans);
            String[] str = ans.split(" ");
            int first = Integer.parseInt(str[0]);
            // System.out.println(first);
            int second = Integer.parseInt(str[1]);
            // System.out.println(second);
            avg1 += first;
            avg2 += second;
        }
        System.out.println((double) avg1 / num + " " + (double) avg2 / num);
    }
}
