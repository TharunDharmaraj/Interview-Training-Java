class Solution
{
    public long findMinDiff (ArrayList<Integer> list, int n, int m)
    {
        Collections.sort(list);
        int smallest = list.get(n-1),diff = 0;
        if(m == n){
            return (long)smallest āāāśṅḥ- list.get(0);
        }
        if(m == 1){
            return (long)0;
        }
        for(int i = 0; i <= n - m ; i++){
            diff = list.get(i+m-1) - list.get(i);
            if(diff < smallest){
                smallest = diff;
            }
        }
        return (long)smallest;
    }
}