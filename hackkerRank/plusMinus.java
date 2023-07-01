// link: https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-one
package hackkerRank;

import java.util.List;

public class plusMinus {
    public static void plusMinus(List<Integer> arr) {
    int zeros= 0 ,pos = 0 , neg = 0;
    for(int i : arr){
        if(i == 0){
            zeros++;
        }else if(i > 0){
            pos++;
        }else{
            neg++;
        }
    }
    int total = arr.size();
    System.out.println((double)pos/total);
    System.out.println((double)neg/total);
    System.out.println((double)zeros/total);
    }
}
