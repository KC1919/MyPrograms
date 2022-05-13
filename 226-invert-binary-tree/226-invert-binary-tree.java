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
    public TreeNode invertTree(TreeNode node) {
        
        if(node==null)
            return null;
        
        invertTree(node.left);
        invertTree(node.right);
        
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        
        return node;
    }
}