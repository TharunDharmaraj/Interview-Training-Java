// Link: https://leetcode.com/problems/trapping-rain-water/solutions/1374608/c-java-python-maxleft-maxright-so-far-with-picture-o-1-space-clean-concise/

class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len]; 
        leftMax[0] = height[0];
        rightMax[len - 1] = height[len - 1];
        for(int i = 1 ; i < len ; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        for(int j = len - 2; j >= 0 ; j--){
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }
        int water = 0,waterLevel;
        for(int i = 0 ; i < len ; i++){
            waterLevel = Math.min(leftMax[i],rightMax[i]);
            if(waterLevel > 0){
                water += waterLevel - height[i];
            }
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));
        return water;
    }
}