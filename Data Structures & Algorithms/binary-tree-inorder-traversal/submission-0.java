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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        inorderHelper(root, ls);
        return ls;
    }
    
    private void inorderHelper(TreeNode node, List<Integer> ls) {
        if (node == null) return;
        inorderHelper(node.left, ls);
        ls.add(node.val);
        inorderHelper(node.right, ls);
    }
}