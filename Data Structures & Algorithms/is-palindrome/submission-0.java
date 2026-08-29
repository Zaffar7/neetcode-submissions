class Solution {
    public boolean isPalindrome(String s) {
       
         StringBuilder sb= new StringBuilder(s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
  int i=0,j=sb.length()-1;
        while(i<j){
            
          if(sb.charAt(i)!=sb.charAt(j)) return false;
           i++;j--;
        }
        return true;
    }
}
