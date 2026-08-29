class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int arr[]= queries.clone();
       int q[]= new int[queries.length];
       Map<Integer, Integer> res = new HashMap<>();
        
        Arrays.sort(queries);
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<Pair>pq= new PriorityQueue<>((a,b)->a.diff-b.diff);
    int j=0;
     for(int i=0;i<queries.length;i++){

 while (j < intervals.length && intervals[j][0] <= queries[i]) {
pq.add(new Pair(intervals[j][1],intervals[j][1]-intervals[j][0]));
 j++;
 }

         while(!pq.isEmpty() && pq.peek().r<queries[i]){
            pq.poll();
         } 
          res.put(queries[i], pq.isEmpty() ? -1 :pq.peek().diff+1);
     }
     for (int k = 0; k < queries.length; k++) {
            q[k] = res.get(arr[k]);
        }
    return q;
    }
    class Pair{
        int r;
        int diff;
        Pair( int r,int diff){
            this.r=r;
            this.diff=diff;
        }
    }
}
