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
    
    int maxSum=-1001;
    
    public int maxPathSum(TreeNode root) {
        
        if(root==null)
            return 0;
        
        maxSum=-1001;
        
        getMaxPathSum(root);
        return maxSum;
        
    }
    
    public int getMaxPathSum(TreeNode node){
        
        if(node==null)
            return 0;
        
        int lres=getMaxPathSum(node.left);
        int rres=getMaxPathSum(node.right);
        
        int max=Math.max(lres,rres);
        
        int myPathSum=node.val;
        
        if(max>=0){
            if(lres>=0 && rres>=0)
                myPathSum+=lres+rres;
            
            else
                myPathSum+=max;
        }
            
        
        maxSum=Math.max(maxSum,myPathSum);
        
        return max>=0?max+node.val:node.val;
    }
}