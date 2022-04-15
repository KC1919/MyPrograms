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
    public TreeNode trimBST(TreeNode node, int low, int high) {
        
        if (node == null) 
            return node;
        
        if (node.val < low) //if the current node value is greater than high, we move left
            return trimBST(node.right, low, high);
        
        if (node.val > high) //if the current node value is smaller than low, we move right
            return trimBST(node.left, low, high);

        node.left = trimBST(node.left, low, high);
        node.right = trimBST(node.right, low, high);
        return node;       
    }
}