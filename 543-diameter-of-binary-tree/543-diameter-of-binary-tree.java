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
    static int maxDia = 0;
    public int diameter(TreeNode root)
    {
        if(root == null)
        return 0;

        int lh = diameter(root.left);
        int rh = diameter(root.right);
        int ht = Math.max(lh, rh) + 1;

        if(maxDia < (lh + rh))
        maxDia = lh + rh;

        return ht;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        diameter(root);
        
        return maxDia;
    }
}