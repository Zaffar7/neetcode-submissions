class Solution {
    public int trap(int[] height) {
        int cnt=0;
        int []pre=new int[height.length];
        int []suf=new int[height.length];
        pre[0]=height[0];
          suf[pre.length-1]=height[pre.length-1];
        for(int i=1;i<pre.length;i++){
        pre[i]= Math.max(pre[i-1],height[i]);
        }
        for(int i=pre.length-2;i>=0;i--){
        suf[i]= Math.max(suf[i+1],height[i]);
        }
        for(int i=0;i<pre.length;i++){
         cnt+=(Math.min(pre[i],suf[i])-height[i]);
        }
return cnt;
    }
}
