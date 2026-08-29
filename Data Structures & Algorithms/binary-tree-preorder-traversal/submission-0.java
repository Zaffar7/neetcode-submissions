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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> ls = new ArrayList<>();
        preHelper(root, ls);
        return ls;
    }
    
    private void preHelper(TreeNode node, List<Integer> ls) {
        if (node == null) return;
          ls.add(node.val);
        preHelper(node.left, ls);  
        preHelper(node.right, ls); 
    }
}