class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int sign=1;
        int ans=0;
        int res=0;
    for(int i=0;i<arr.length-1;i++){
        if( arr[i]>arr[i+1]&& sign==-1){
        sign=1;
        ans+=1;
        }
        else if( arr[i]<arr[i+1]&& sign==1){
            sign=-1;
            ans+=1;
        }
        else{
          ans=0;
          sign=1;
           if (arr[i] < arr[i + 1]) {
                    sign = -1;
                    ans = 1;
                }
                else if (arr[i] > arr[i + 1]) {
                    sign = 1;
                    ans = 1;
                }

        }
        res=Math.max(res,ans);
    }
    
return res+1;
    }
}