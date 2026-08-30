class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][]= new boolean[image.length][image[0].length];
        int oc= image[sr][sc];
        dfs(image,sr,sc,color,oc,vis);
        return image;
    }
 void   dfs(int [][]image,int sr, int sc, int color, int oc,boolean [][]vis){ if(sr<0 || sr>image.length-1 || sc<0 || sc>image[0].length-1 ||image[sr][sc]!=oc )    return ;
        if(vis[sr][sc]) return;
        vis[sr][sc]=true;
        image[sr][sc]=color;
    dfs(image,sr+1,sc,color,oc,vis); 
    dfs(image,sr-1,sc,color,oc,vis); 
    dfs(image,sr,sc+1,color,oc,vis);
    dfs(image,sr,sc-1,color,oc,vis);    
    }
}