class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings,(a,b)-> a[0]-b[0]); 
        PriorityQueue<Integer> rm= new PriorityQueue<>();
        int arr[]= new int[n];
        PriorityQueue<Pair> occupied= new PriorityQueue<>((a,b)->(a.e==b.e)?(a.room-b.room):(a.e-b.e));
        for(int I=0;I<n;I++){
        rm.add(I);
        }
        for(int i=0;i<meetings.length;i++){
            int st=meetings[i][0];
            int end=meetings[i][1];
            while(!occupied.isEmpty()&& occupied.peek().e<=st){
               rm.add( occupied.poll().room);

            }
            if(!rm.isEmpty()){
                int rome= rm.poll();
                occupied.add(new Pair(st,end,rome));
                arr[rome]++;
            }else{
              Pair rome=occupied.poll();
                int diff=rome.e-st;
                 occupied.add(new Pair(st+diff,end+diff,rome.room));
                 arr[rome.room]++;
            }
        }
        int ans=-1;
        int maxi=-1;
        for(int i=0;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
               ans=i;
            }
        }
        return ans;
    }
}
class Pair{
    int s;
    int e;
    int room;
    public Pair(int s, int e, int room){
        this.s=s;
        this.e=e;
        this.room=room;
    }
}