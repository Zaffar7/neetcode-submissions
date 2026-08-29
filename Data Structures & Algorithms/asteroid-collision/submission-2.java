class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0)st.push(asteroids[i]);
          else  { 
                while(!st.isEmpty() &&st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }
              if (!st.isEmpty() && st.peek() > 0 && st.peek() == Math.abs(asteroids[i])) {
                    st.pop();
                }
          // push only if:
                // stack empty OR top is negative (no collision)
                else if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);   // ⚠️ push original (negative)
                }
                  
            }
        }
        int arr[]=new int[st.size()];
        int idx=st.size()-1;
while(st.size()>0){
    arr[idx--]=st.pop();
}
return arr;
    }
}