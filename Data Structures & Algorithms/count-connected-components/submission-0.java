class Solution {
    public int countComponents(int n, int[][] edges) {
 int cnt=0;
        boolean vis[]= new boolean[n];
        LinkedList<Integer> []adj= new LinkedList[n];
        for(int i = 0; i < n; i++) {
    adj[i] = new LinkedList<>();
}
        for(int i=0;i<edges.length;i++){
        adj[edges[i][0]].add(edges[i][1]);
        adj[edges[i][1]].add(edges[i][0]);
        }
        for(int i=0;i<n;i++){
           if(!vis[i]) {dfs(adj,vis,i);
            cnt++;
        }
        }
        return cnt;
    }
     void dfs(LinkedList<Integer> []adj,boolean vis[],int idx){
    vis[idx]=true;
    for(int nbr: adj[idx]){
    if(!vis[nbr]) dfs(adj,vis,nbr);
    }
    }
}
