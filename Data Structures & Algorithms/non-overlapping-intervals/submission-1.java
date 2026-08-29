class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Pair[] arr = new Pair[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            arr[i] = new Pair(intervals[i][0], intervals[i][1]);
        }
        int cnt=0;
        Arrays.sort(arr); 
        int curr= arr[0].end;
        for(int i=1;i<arr.length;i++){
        if(curr<=arr[i].start){
            curr=arr[i].end;
        }else {cnt++;
         curr = Math.min(curr, arr[i].end);}
        }
        return cnt;
    }
}
class Pair implements Comparable<Pair> {
    int start;
    int end;

    Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.start, other.start); // sort by start
    }
}
