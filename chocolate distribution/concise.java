class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if(m>n) return -1;
        Collections.sort(a);
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<=n-m; i++){
            ans = Math.min(ans,a.get(i+m-1) - a.get(i));
        }
        return (long)ans;// your code here
    }
}