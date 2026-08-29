class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
    //    if(s.length()==1) return false;
       // if(s.charAt(0)==')' || s.charAt(0)=='}'|| s.charAt(0)==']') return false;
     //   st.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(s.charAt(i)=='(' ||s.charAt(i)=='{'||s.charAt(i)=='[')
            st.push(c);
            if(s.charAt(i)==')'){
                if(st.isEmpty() || st.peek()!='(') return false;
                st.pop();
            } 
           else if(s.charAt(i)==']'){
                if(st.isEmpty() || st.peek()!='[') return false;
                st.pop();
           }
           else if(s.charAt(i)=='}'){
                if(st.isEmpty() || st.peek()!='{') return false;
                st.pop();
            }
        
        }
        return st.isEmpty();
    }
}
