package longest sub arr of 1;

import java.util.List;

class Solution {
    public int longestSubarray(List<Integer> nums) {
        int l = 0, r = 0;
        int mx = 0, count = 0, total = 0;
        while (r < nums.size()) {
            if (nums.get(r) == 0) {
                count++;
                while (count > 1) {
                    if (nums.get(l) == 0)
                        count--;
                    else
                        total--;
                    l++;
                }
            } else {
                total++;
                mx = Math.max(mx, total);
            }
            r++;
        }
        if (mx == nums.size())
            mx--;
        return mx;
    }
}

