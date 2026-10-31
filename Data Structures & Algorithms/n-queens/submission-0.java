class Solution {
    public List<List<String>> solveNQueens(int n) {
     List<List<String>> ls= new ArrayList<>();
    char grid[][]= new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
          grid[i][j]='.';
    }
   f(grid, 0,ls, new ArrayList<>());
    return ls;}    
  void  f(char grid[][], int row,List<List<String>>ls,List<String> temp){
        if(row==grid.length){
            ls.add(new ArrayList<>(temp));
            return ;
        }
        for (int j = 0; j < grid[0].length; j++) {  
       if (safe(grid, row, j)) {
        grid[row][j] = 'Q';
        temp.add(new String(grid[row]));
       f(grid, row + 1, ls,temp);
        grid[row][j] = '.';
        temp.remove(temp.size()-1);
    }
}
    }
    boolean safe(char grid[][],int row, int col){
        int i, j;
    // 1. Check the vertical column straight up
    for (i = 0; i < row; i++) {
        if (grid[i][col] == 'Q') {
            return false;
        }
    }
    // 2. Check the diagonal up-left
    for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
        if (grid[i][j] == 'Q') {
            return false;
        }
    }
    // 3. Check the diagonal up-right
    for (i = row, j = col; i >= 0 && j < grid[0].length; i--, j++) {
        if (grid[i][j] == 'Q') {
            return false;
        }
    }
    return true;
    }
}
