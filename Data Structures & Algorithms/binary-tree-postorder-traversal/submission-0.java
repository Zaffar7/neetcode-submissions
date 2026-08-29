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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        postHelper(root, ls);
        return ls;
    }
    
    private void postHelper(TreeNode node, List<Integer> ls) {
        if (node == null) return;
          
        postHelper(node.left, ls);  
        postHelper(node.right, ls);  
        ls.add(node.val);
    }
}