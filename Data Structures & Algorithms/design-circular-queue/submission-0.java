class MyCircularQueue {
Stack<Integer> st1;
int siz;
    public MyCircularQueue(int k) {
    st1= new Stack<>();    
     siz=k;
    }
    
    public boolean enQueue(int value) {
       if(st1.size()==siz) return false;
       st1.push(value);
       return true;
    }
    
    public boolean deQueue() {
        Stack<Integer>st2=new Stack<>();
        if(st1.isEmpty()) return false;
        while( st1.size()>1){
            st2.push(st1.pop());
        }
        st1.pop();
       while(!st2.isEmpty()){
            st1.push(st2.pop());
        } 
        return true;
    }
    
    public int Front() {
       Stack<Integer>st2=new Stack<>();
        if(st1.isEmpty()) return -1;
        while( st1.size()>1){
            st2.push(st1.pop());
        }
     int ans=   st1.pop();
     st1.push(ans);
       while(!st2.isEmpty()){
            st1.push(st2.pop());
        } 
        return ans; 
    }
    
    public int Rear() {
        if(st1.isEmpty()) return -1;
        return st1.peek();
    }
    public boolean isEmpty() {
        if(st1.size()==0) return true;
        return false;
        
    }
    
    public boolean isFull() {
          if(st1.size()==siz) return true;
        return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */