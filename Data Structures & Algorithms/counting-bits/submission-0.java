class Solution {
    public int[] countBits(int n) {
        int arr[]= new int[n+1];
        for(int i=0;i<=n;i++){
        arr[i]=hammingWeight(i);
        }
        return arr;
    }
      int hammingWeight(int n) {
        int c=0;
        while(n!=0){
             c += (n & 1) == 1 ? 1 : 0;
            n >>= 1;
        }
        return c;
    }
}
