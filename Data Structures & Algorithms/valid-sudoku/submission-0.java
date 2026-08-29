class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
             if(!fun(board,i,j)) return false;
            }
        }
        return true;
    }
    boolean fun(char[][] board,int r,int c){
    if(board[r][c]=='.') return true;
        //row
    for(int i=0;i<9;i++){
    if(c!=i && board[r][i]==board[r][c]) return false;
    if(r!=i && board[i][c]==board[r][c]) return false;
    int row = 3*(r/3) + i/3;
    int col = 3*(c/3) + i%3;
if((row != r || col != c) &&  board[row][col] == board[r][c])
    return false;
    }

      return true;
    }
}
