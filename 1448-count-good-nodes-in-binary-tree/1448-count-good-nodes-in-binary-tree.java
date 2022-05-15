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
    
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root==null)
            return 0;
        
        count=0;
        
        helper(root,root);
        
        return count;
    }
    
    public void helper(TreeNode node, TreeNode prev){
        
        if(node==null)
            return;
        
        if(node.val>=prev.val){
            prev=node;
            count++;
        }
        
        helper(node.left,prev);
        helper(node.right,prev);
    }
}