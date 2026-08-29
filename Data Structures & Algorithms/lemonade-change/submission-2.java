class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)f++;
           else if(bills[i]==10){t++;
            if(f>0)f--;else return false;}
           else {
             if(t>0 && f>0){f--;t--;}
              else if(f>=3)f-=3;
              else return false;
            }
            
        }
        return true;
    }
}