class Solution {
    public String decodeString(String s) {
      Stack<String>st= new Stack<>();
      for(int i=0;i<s.length();i++){
        StringBuilder sb= new StringBuilder();
        if(s.charAt(i)==']'){
            while(!st.peek().equals("[")){
               sb.insert(0, st.pop());
            }
            st.pop();
               // Read complete number (handles multi-digit)
                StringBuilder num = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
                    num.insert(0, st.pop());
                }

                int cnt = Integer.parseInt(num.toString());

                StringBuilder res = new StringBuilder();

                while (cnt-- > 0) {
                    res.append(sb);
                }

                st.push(res.toString());     
            }
        else st.push(String.valueOf(s.charAt(i)));

      }  
       StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }

        return ans.toString();
    }
}