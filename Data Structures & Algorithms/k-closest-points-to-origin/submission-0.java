class Solution {
    public int[][] kClosest(int[][] points, int k) {
PriorityQueue<Pair> pq= new PriorityQueue<>((a, b) -> b.d - a.d);    
     for(int i=0;i<points.length;i++){
        int x1= (points[i][0]-0)*(points[i][0]-0);
        int y1= (points[i][1]-0)*(points[i][1]-0);
        int dis= (x1+y1);
        Math.sqrt(dis);
        if(pq.size()<k){
            pq.add(new Pair(dis,points[i][0],points[i][1]));
        }else{
if(pq.peek().d>dis){
    pq.remove(pq.peek());
    pq.add(new  Pair(dis, points[i][0],points[i][1]));
}else continue;

        }    
     }
     int ans[][]= new int[pq.size()][2];
     int idx=0;
     while(!pq.isEmpty()){
 Pair p=pq.remove();
ans[idx][0]=p.p1;
ans[idx][1]=p.p2;
idx++;
     }
     return ans;
    }
}
class Pair{
    int d;
    int p1;
    int p2;
    Pair(int d, int p1, int p2){
        this.d=d;
        this.p1=p1;
        this.p2=p2;
    }
}
