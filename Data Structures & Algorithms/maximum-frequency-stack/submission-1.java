class FreqStack {
Stack<Integer> st;
HashMap<Integer,Integer>map;
    public FreqStack() {
        map= new HashMap<>();
        st= new Stack<>();
    }
    
    public void push(int val) {
        map.put(val,map.getOrDefault(val,0)+1);
        st.push(val);
    }
    
    public int pop() {
         // Traverse the HashMap
         int maxFrequency = 0;
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // Check for maximum frequency
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
               // mostFrequentKey = entry.getKey();
            }
        }
      /* if(st.peek()==maxFrequency) return st.pop();
        Stack<Integer> sup= new Stack<>();
        while(st.peek()!=maxFrequency){
            sup.push(st.pop());
        }*/
      //   Stack<Integer> sup= new Stack<>();
         // Find topmost element having max frequency
       /* while (!st.isEmpty() && map.get(st.peek()) != maxFrequency) {
            sup.push(st.pop());
        }

        int ans = st.pop();*/

        // decrease frequency
       // map.put(ans, map.get(ans) - 1);

       /* if (map.get(ans) == 0) {
            map.remove(ans);
        }*/
  //  int ans= st.pop();
     /* while(!sup.isEmpty()){
        st.push(sup.pop());
      }*/
// return ans;
    int maxCnt = Collections.max(map.values());
        int i = st.size() - 1;
        while (map.get(st.get(i)) != maxCnt) {
            i--;
        }
        int val = st.remove(i);
        map.put(val, map.get(val) - 1);
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */