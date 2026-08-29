/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
        List<Integer>ls=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
       // Queue<Integer> q=new Queue<>();
        dfs(root,0);
        return ls;
    }
    void dfs(TreeNode node,int lvl){
        if(node==null ) return ;
        if(ls.size()==lvl) ls.add(node.val);
        dfs(node.right,lvl + 1);
        dfs(node.left,lvl + 1);
    }

}
