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
        
        //as we reach the deepest leaf node, we return its value
        if(level==1)
            return node.val;
        
        //we get the result from the left subtree
        int lres=helper(node.left,level-1);
        
        //fet the result from the right subtree
        int rres=helper(node.right,level-1);
        
        return lres+rres; //return the sum of the resultgot from the left and right subtree
    }
    
    //function to ind the height of the tree
    public int maxHeight(TreeNode node){
        
        if(node==null)
            return 0;
        
        int lres=maxHeight(node.left);
        int rres=maxHeight(node.right);
        
        return Math.max(lres,rres)+1;
    }
}