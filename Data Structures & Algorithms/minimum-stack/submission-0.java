class MinStack {

   Stack<Integer>st;
Stack<Integer>min;
    public MinStack() {
        min=new Stack<>();
        st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()) {  // Only push new/equal mins
            min.push(val);
        }
    }
    
    public void pop() {
        
        if (st.peek().equals(min.peek())) {        // Check BEFORE pop
            min.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
