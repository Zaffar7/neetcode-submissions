class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=0;
        while(i<j){
            int w=j-i;
            int h=Math.min(height[i],height[j]);
            max=Math.max(max,w*h);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return max;
    }
}
