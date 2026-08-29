class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n= hand.length;
        if(n%groupSize!=0) return false;
        HashMap<Integer,Integer> map= new HashMap<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<n;i++){
          if(!pq.contains(hand[i]))  pq.add(hand[i]);
        map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        while(pq.size()>0){
            int var=pq.peek();
            for(int i=var;i<var+groupSize;i++){
                if(!map.containsKey(i)) return false;
               map.put(i,map.get(i)-1);
               if(map.get(i)==0){
                if(i!=pq.peek()) return false;
                pq.poll();
               } 
            }
        }
return true;

    
    }
}
