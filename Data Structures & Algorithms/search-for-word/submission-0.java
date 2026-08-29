class Solution {
    public boolean exist(char[][] board, String word) {
       int m= board.length;
       int n= board[0].length;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
         if (board[r][c]== word.charAt(0) && f(board,word,0,r,c,m,n)) 
                    return true;
                }
            }
    
        return false;
    }
  boolean f(char[][] board,String word,int idx,int i, int j,int m,int n ){
   if(idx==word.length()) return true;
   if(i<0|| j<0 || i>=m|| j>=n ||board[i][j]=='@' ) return false;
   if(board[i][j]!=word.charAt(idx)) return false;
   char temp=board[i][j];
   board[i][j]='@';

   if(f(board,word,idx+1,i+1,j,m,n)||f(board,word,idx+1,i,j+1,m,n)|| f(board,word,idx+1,i-1,j,m,n)||f(board,word,idx+1,i,j-1,m,n))
   return true;
   
   //backtrack
   board[i][j]=temp;
   return false;
  }

}
