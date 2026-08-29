class pair{
    int val;
    int idx;
    public pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
}
class StockSpanner {
Stack<pair>st;
    public StockSpanner() {
       st  = new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!st.isEmpty() && st.peek().val<=price){
            span+=st.pop().idx;
        }
        st.push(new pair(price,span));
    
    return span;
}
}
//$0

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */