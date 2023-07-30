package min speed to arrive ontime;

class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        // System.out.println((double)1 / 3);
        // return 1;
        int n = dist.length;
        if(hour <= n - 1){
            return -1;
        }
        int left = 1, right = (int)1e7;
        while(left < right){
            int mid = left + (right - left) / 2;
            double time = 0;
            for(int i = 0 ; i < dist.length - 1 ; i++){
                time += Math.ceil((double)dist[i] / mid);
            }
            time += (double)dist[n - 1] / mid;
            if(time <= hour){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}