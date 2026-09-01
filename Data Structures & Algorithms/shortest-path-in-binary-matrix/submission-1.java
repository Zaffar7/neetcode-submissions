class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
int n = grid.length;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        Queue<Pair> q = new LinkedList<>();
       // If starting cell is blocked
        if (grid[0][0] == 1) return -1;
        q.add(new Pair(0, 0));
        vis[0][0] = true;
 //8 possible directions
  int[][] dir = { {-1, -1}, {-1, 0}, {-1, 1}, { 0, -1}, { 0, 1}, { 1, -1}, { 1, 0}, { 1, 1} };
        int cnt = 0;

        while (q.size() > 0) {
            int size = q.size();
            cnt++;
      for (int k = 0; k < size; k++) {
              Pair rm = q.remove();
                // Destination
 if (rm.i == grid.length - 1 &&   rm.j == grid[0].length - 1) {
                    return cnt;
                        }
for (int[] d : dir) { 
    int ni = rm.i + d[0]; int nj = rm.j + d[1]; 
// Check boundary + cell value + visited 
if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] == 0 && !vis[ni][nj]) {
     vis[ni][nj] = true; q.add(new Pair(ni, nj)); } 
  }                             
            }
        }

        return -1;
    }
}

class Pair {
    int i;
    int j;

    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
