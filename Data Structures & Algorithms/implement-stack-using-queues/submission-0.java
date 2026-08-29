class MyStack {
Queue<Integer>q;
    public MyStack() {
        q= new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int cnt= q.size();
        while(cnt-1>0){
            q.add(q.remove());
            cnt--;
        }
     return   q.remove();
    }
    
    public int top() {
        int cnt= q.size();
        while(cnt-1>0){
            q.add(q.remove());
            cnt--;
        }
         int top = q.peek();     // last element
        q.add(q.remove()); 
      return  top;
    }
    
    public boolean empty() {
       return q.isEmpty(); 
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */