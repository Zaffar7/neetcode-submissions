class Solution {
    public boolean canFinish(int n, int[][] pre) {
  LinkedList<Integer>adj[]= new LinkedList[n];
       for(int i=0;i<n;i++) adj[i]= new LinkedList<>();
      for(int i=0;i<pre.length;i++){
        adj[pre[i][0]].add(pre[i][1]);
      }  
      boolean vis[]= new boolean[n];
      boolean cpath[]= new boolean[n];
      for(int i=0;i<n;i++){
      if(!vis[i] && dfs(adj, i, vis,cpath)) return false;
      }
return true;
    }
    boolean dfs(LinkedList<Integer>adj[], int i, boolean []vis,boolean[] cpath){
      vis[i]=true;
      cpath[i]=true;
      for(int nbr: adj[i]){
        if(!vis[nbr]) {
           if( dfs(adj,nbr,vis,cpath))
        return true;}
        else if(cpath[nbr]) return true;
         
      }
     cpath[i]=false;
      return false;
    }
}
