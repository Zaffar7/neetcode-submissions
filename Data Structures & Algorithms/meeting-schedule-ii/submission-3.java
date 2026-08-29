/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
         if (intervals.size() == 0) return 0;
  Pair[] arr = new Pair[intervals.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Pair(intervals.get(i).start, intervals.get(i).end);
        }
        Arrays.sort(arr);
       
 PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(arr[0].end);
        for (int i = 1; i < arr.length; i++) {
            if ( pq.peek() <= arr[i].start) {
                pq.poll(); // room becomes free
            }

            pq.offer(arr[i].end);
        }

        return pq.size();
       

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
        return Integer.compare(this.start, other.start);
    }
}
