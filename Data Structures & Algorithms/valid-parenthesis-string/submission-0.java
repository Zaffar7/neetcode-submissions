class Solution {
    public boolean checkValidString(String s) {
       int lmin=0;
       int lmax=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            lmin++; lmax++;
        }else if(s.charAt(i)==')'){
            lmin--;
            lmax--;
            if(lmin<0)lmin=0;
            if(lmax<0)return false;
        }else{
           lmin--;
            lmax++;
              if(lmin<0)lmin=0;
        }
       }
       return lmin==0; 
    }
}
