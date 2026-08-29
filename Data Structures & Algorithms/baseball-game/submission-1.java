class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+") && st.size() > 1){
             int a= st.pop();
             int b=st.peek();
             st.push(a);
            sum+= st.push(a+b);
            }else if(operations[i].equals("D") && !st.isEmpty()){
                int v= st.peek();
              sum+=  st.push(v*2);
            }else if(operations[i].equals("C") && !st.isEmpty()){
            sum-= st.pop();
            }else sum+=st.push(Integer.parseInt(operations[i]));
        }
      /*  while(!st.isEmpty()){
            sum+=st.pop();
        }*/
        return sum;
    }
}