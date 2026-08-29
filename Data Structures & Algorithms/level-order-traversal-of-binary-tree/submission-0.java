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
    List <List<Integer> > level = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
         Queue <TreeNode> q= new LinkedList<>(); 
          if(root== null) return level;
        q.add(root);
      while(!q.isEmpty()) { 
      int a= q.size();  
     List<Integer> onelevel= new ArrayList<>();
     for(int i=0;i<a;i++){
      TreeNode rv=q.remove();
 onelevel.add(rv.val);
  if(rv.left!=null)
    q.add(rv.left);
      if(rv.right!=null)
  q.add(rv.right);
      }
      level.add(onelevel);

      }
      
  
        return level;
    }
}
