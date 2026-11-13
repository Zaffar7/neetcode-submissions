class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<Pair>q= new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            if(grid[i][j]==0)q.add(new Pair(i,j,0));
           } 
        }
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int size=q.size();
            for(int k=0;k<size;k++){
        Pair rm=q.remove();
        int i=rm.x;
        int j=rm.y;
        int c=rm.cnt;
        for(int d[]:dir){
            int x = i + d[0];
                int y = j + d[1];
            if(x >= 0 && x < m && y >= 0 && y < n
                   && grid[x][y] == 2147483647 ){
                   grid[x][y]=c+1;
                   q.add(new Pair(x,y,c+1));}
        }
            }

        }
    }
    class Pair{
        int x,y,cnt;
        Pair(int x, int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
}
