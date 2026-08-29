class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
            digits[digits.length-1]=digits[digits.length-1]+1;
        for(int i=digits.length-1;i>=0;i--){
            int n=digits[i]+carry;
              digits[i]=n%10;
                carry=n/10;
            }
        int arr[]= new int[digits.length+1];
        if(carry==1){arr[0]=carry;
        for(int i=1;i<arr.length;i++)arr[i]=digits[i-1];
        }
    return carry==1 ?arr:digits;}
}
