// Link: https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-one
package hackkerRank;

public class timeConversion {
     public static String timeConversion(String s) {
    // Write your code here
        int len = s.length();
        String hours = s.substring(0,2);
        String minutes = s.substring(3,5);
        String seconds = s.substring(6,len-2);
        String meridian = s.substring(len -2 , len);
        if(meridian.equals("PM") && !hours.equals("12")){
            int hoursInt =  Integer.parseInt(hours) + 12;
            hours = Integer.toString(hoursInt);
        }else if(meridian.equals("AM") && hours.equals("12")){
            hours = "00";
        }
        String time = hours + ":" + minutes + ":"+seconds;
        return time;
    }

}
