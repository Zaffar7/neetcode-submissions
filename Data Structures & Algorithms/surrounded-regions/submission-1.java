class Solution {
    public void solve(char[][] board) {
          int m = board.length;
        int n = board[0].length;

        // Top and bottom boundaries
        for (int j = 0; j < n; j++) {

            if (board[0][j] == 'O') {
                dfs(0, j, board);
            }

            if (board[m - 1][j] == 'O') {
                dfs(m - 1, j, board);
            }
        }

        // Left and right boundaries
        for (int i = 1; i < m - 1; i++) {

            if (board[i][0] == 'O') {
                dfs(i, 0, board);
            }

            if (board[i][n - 1] == 'O') {
                dfs(i, n - 1, board);
            }
        }

        // Remaining O -> X
        // @ -> O
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                else if (board[i][j] == '@') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    void dfs(int i, int j, char[][] board) {

        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length ||
            board[i][j] != 'O') {
            return;
        }

        // Mark current O as safe
        board[i][j] = '@';

        dfs(i + 1, j, board);
        dfs(i - 1, j, board);
        dfs(i, j + 1, board);
        dfs(i, j - 1, board);
    }
}
