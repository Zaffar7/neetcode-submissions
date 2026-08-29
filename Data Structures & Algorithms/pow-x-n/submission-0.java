class Solution {
    double ans=0;
    public double myPow(double x, int n) {
        
        if(n<0) return 1.0 / myPow(x, -n);
        if(n==1) return x;
        if(n==0) return 1;
        if(n%2==0)ans= myPow(x,n/2)*myPow(x,n/2);
        else ans= x*myPow(x,n/2)*myPow(x,n/2);
         return ans;  }
}
