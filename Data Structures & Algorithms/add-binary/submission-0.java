class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
         int carry=0;
        int len= Math.max(a.length(),b.length());
      
        for(int i=0;i<len;i++){   int add = carry;
        if (i < a.length()) {
                add += a.charAt(a.length() - 1 - i) - '0';
            }
            if (i < b.length()) {
                add += b.charAt(b.length() - 1 - i) - '0';
            }
         sb.append(add%2);
         carry= add/2;
        }
        if(carry!=0) sb.append(1);
return sb.reverse().toString();
    }
}