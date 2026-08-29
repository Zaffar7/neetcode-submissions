class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        //Stack<String> op= new Stack<>();
        for(int i=0;i<tokens.length;i++){
           // String token = tokens[i];
    // if (token.equals("+") || token.equals("-") ||
     //           token.equals("*") || token.equals("/")) {
                //op.push(token);
              //  String ops =op.pop();
          if(tokens[i].equals("+") || tokens[i].equals("-") || 
               tokens[i].equals("*") || tokens[i].equals("/")) {         
                int b=st.pop();
                  int a= st.pop();
                int res=0;
               /* if (ops.equals("+")) res = a + b;
                else if (ops.equals("-")) res = a - b;
                else if (ops.equals("*")) res = a * b;
                else res = a / b;*/
                if(tokens[i].equals("+")) res = a + b;
                else if(tokens[i].equals("-")) res = a - b;
                else if(tokens[i].equals("*")) res = a * b;
                else res = a / b;
                   st.push(res);
                }else 
                st.push(Integer.parseInt(tokens[i]));
            }
            return st.peek();
        }
    }

