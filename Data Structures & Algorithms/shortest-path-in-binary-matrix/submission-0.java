class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        boolean[][] vis = new boolean[grid.length][grid[0].length];

        Queue<Pair> q = new LinkedList<>();

        // If starting cell is blocked
        if (grid[0][0] == 1)
            return -1;

        q.add(new Pair(0, 0));
        vis[0][0] = true;

        int cnt = 0;

        while (q.size() > 0) {

            int size = q.size();
            cnt++;

            for (int k = 0; k < size; k++) {

                Pair rm = q.remove();

                // Destination
                if (rm.i == grid.length - 1 &&
                    rm.j == grid[0].length - 1) {
                    return cnt;
                }

                // left
                if (rm.j - 1 >= 0 &&
                    grid[rm.i][rm.j - 1] == 0 &&
                    !vis[rm.i][rm.j - 1]) {

                    vis[rm.i][rm.j - 1] = true;
                    q.add(new Pair(rm.i, rm.j - 1));
                }

                // bottom-left
                if (rm.i + 1 < grid.length &&
                    rm.j - 1 >= 0 &&
                    grid[rm.i + 1][rm.j - 1] == 0 &&
                    !vis[rm.i + 1][rm.j - 1]) {

                    vis[rm.i + 1][rm.j - 1] = true;
                    q.add(new Pair(rm.i + 1, rm.j - 1));
                }

                // bottom
                if (rm.i + 1 < grid.length &&
                    grid[rm.i + 1][rm.j] == 0 &&
                    !vis[rm.i + 1][rm.j]) {

                    vis[rm.i + 1][rm.j] = true;
                    q.add(new Pair(rm.i + 1, rm.j));
                }

                // top-left
                if (rm.i - 1 >= 0 &&
                    rm.j - 1 >= 0 &&
                    grid[rm.i - 1][rm.j - 1] == 0 &&
                    !vis[rm.i - 1][rm.j - 1]) {

                    vis[rm.i - 1][rm.j - 1] = true;
                    q.add(new Pair(rm.i - 1, rm.j - 1));
                }

                // bottom-right
                if (rm.i + 1 < grid.length &&
                    rm.j + 1 < grid[0].length &&
                    grid[rm.i + 1][rm.j + 1] == 0 &&
                    !vis[rm.i + 1][rm.j + 1]) {

                    vis[rm.i + 1][rm.j + 1] = true;
                    q.add(new Pair(rm.i + 1, rm.j + 1));
                }

                // right
                if (rm.j + 1 < grid[0].length &&
                    grid[rm.i][rm.j + 1] == 0 &&
                    !vis[rm.i][rm.j + 1]) {

                    vis[rm.i][rm.j + 1] = true;
                    q.add(new Pair(rm.i, rm.j + 1));
                }

                // top
                if (rm.i - 1 >= 0 &&
                    grid[rm.i - 1][rm.j] == 0 &&
                    !vis[rm.i - 1][rm.j]) {

                    vis[rm.i - 1][rm.j] = true;
                    q.add(new Pair(rm.i - 1, rm.j));
                }

                // top-right
                if (rm.i - 1 >= 0 &&
                    rm.j + 1 < grid[0].length &&
                    grid[rm.i - 1][rm.j + 1] == 0 &&
                    !vis[rm.i - 1][rm.j + 1]) {

                    vis[rm.i - 1][rm.j + 1] = true;
                    q.add(new Pair(rm.i - 1, rm.j + 1));
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
