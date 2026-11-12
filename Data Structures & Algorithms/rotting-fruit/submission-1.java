class Solution {
    public int orangesRotting(int[][] grid) {
       Queue<Pair> q= new LinkedList<>();
       int t=0;
       int fresh=0;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2)
            q.add(new Pair(i,j));
            if(grid[i][j]==1) fresh++;
        }
       }  int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
       while(!q.isEmpty() && fresh > 0){  t++;
        int size= q.size();
        for(int k=0;k<size;k++){
       Pair rm=q.remove();
       int  i=rm.x;
       int j=rm.y;
      for(int[] d : dir) {
                int x = i + d[0];
                int y = j + d[1];
            if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length
                   && grid[x][y] == 1) {
                    grid[x][y] = 2;
                    fresh--;
                    q.add(new Pair(x, y));
                }     
             }
        }
      
    }
return fresh > 0 ? -1 : t;
    }
    class Pair{
        int x,y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}
