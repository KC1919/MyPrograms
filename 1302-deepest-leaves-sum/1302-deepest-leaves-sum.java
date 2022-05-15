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
    public int deepestLeavesSum(TreeNode node) {
        
        int maxDepth=maxHeight(node);
        return helper(node,maxDepth);
    }
    
    public int helper(TreeNode node, int level){
        
        if(node==null)
            return 0;
        
        //as we reach the deepest leaf node
        if(level==1)
            return node.val;
        
        int lres=helper(node.left,level-1);
        int rres=helper(node.right,level-1);
        
        return lres+rres;
    }
    
    public int maxHeight(TreeNode node){
        
        if(node==null)
            return 0;
        
        int lres=maxHeight(node.left);
        int rres=maxHeight(node.right);
        
        return Math.max(lres,rres)+1;
    }
}