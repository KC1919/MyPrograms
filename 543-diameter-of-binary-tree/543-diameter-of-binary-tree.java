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
    
    int maxdia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxdia=0;
        maxDia(root);
        return maxdia;
    }
    
    public int maxDia(TreeNode node){
        if(node==null)
            return 0;
        
        int lres=maxDia(node.left);
        int rres=maxDia(node.right);
        
        int mydia=lres+rres;
        
        maxdia=Math.max(maxdia,mydia);
        
        return Math.max(lres,rres)+1;
    }
}