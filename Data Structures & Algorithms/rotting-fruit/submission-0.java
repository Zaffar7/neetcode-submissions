class Solution {

    public int orangesRotting(int[][] grid) {
       int fresh=0; 
         Queue<Pair> q= new LinkedList<>();
     boolean vis[][] = new boolean[grid.length][grid[0].length];  
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if (grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                    vis[i][j] = true;
                }

                if (grid[i][j] == 1)fresh++;
        }
     } 
       int cnt=0;
    while(q.size()>0){
         int size = q.size();
  for (int k = 0; k < size; k++) {
     Pair p= q.remove();
     int r=p.i;
     int c=p.j;
        if(r-1 >= 0 && grid[r-1][c]==1 && vis[r-1][c]==false){
            grid[r-1][c]=2;
             vis[r - 1][c] = true;
 q.add(new Pair(r-1,c));
 fresh--;
        }
        if(r+1 <grid.length  && grid[r+1][c]==1 && vis[r+1][c]==false){
            grid[r+1][c]=2;
             vis[r + 1][c] = true;
 q.add(new Pair(r+1,c));
      fresh--;   }
        if(c-1>= 0 && grid[r][c-1]==1 && vis[r][c-1]==false){
            grid[r][c-1]=2;
             vis[r][c-1] = true;
 q.add(new Pair(r,c-1));
      fresh--;   }
        if(c+1 <grid[0].length && grid[r][c+1]==1 && vis[r][c+1]==false){
            grid[r][c+1]=2;
             vis[r][c+1] = true;
 q.add(new Pair(r,c+1));
      fresh--;   }
    }
         if (!q.isEmpty()) {
                cnt++;
            }

    } 

     return fresh==0?cnt:-1;
    }

   
    }
class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i=i;
        this.j=j;
    }
}
