class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       int i = 0;
        List<int[]> result = new ArrayList<>();
        int n = intervals.length;

        while (i < n) {
            if (intervals[i][1] < newInterval[0]) {//3<2 6<2 end <new st
                result.add(intervals[i]);// adding sp
            } else if (intervals[i][0] > newInterval[1]) {//1>5  4>5
                break;
            } else {
                // Merge the intervals and check further
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]); //1
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);//3
            }
            i++;
        }

        result.add(newInterval);//last point
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
