class MyQueue {
Stack<Integer>st1;
Stack<Integer>st2;
    public MyQueue() {
        st1= new Stack<>();
        st2= new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
     int size= st1.size();
     while(size-1>0){
        st2.push(st1.pop());
        size--;
     }
     int  p= st1.pop();
     size= st2.size();
     while(size>0){
        st1.push(st2.pop());
        size--;
     }
       return p; 
    }
    
    public int peek() {
    int size= st1.size();
     while(size-1>0){
        st2.push(st1.pop());
        size--;
     }
     int  p= st1.peek(); 
     size= st2.size();
     while(size>0){
        st1.push(st2.pop());
        size--;
     }   
     return p;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */