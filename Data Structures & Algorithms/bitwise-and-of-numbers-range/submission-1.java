class Solution {
    public int rangeBitwiseAnd(int left, int right) {
       /* int ans=left;
        for(int i=left+1;i<=right;i++){
            ans=ans&i;
        }
        return ans;*/
       int i=0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            i++;
        }
        return left<<i;
    }
}