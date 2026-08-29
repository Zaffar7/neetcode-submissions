class MovingAverage {
    Queue<Integer>q;
    int sum;
int size;
    public MovingAverage(int size) {
        this.size=size;
        q=new LinkedList<>();
        sum=0;
    }
    
    public double next(int val) {
        if(size==q.size()) sum-=q.poll();

       sum+=val;
       q.add(val);
        return (sum*1.0)/Math.min(size,q.size());
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
