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
    int max=-1001;
    public int maxPathSum(TreeNode root) {
        
        max=-1001;
        maxSum(root);
        return max;
    }
    
    private int maxSum(TreeNode node){
        
        if(node==null){
            return -1001;
        }
        
        int lres=maxSum(node.left);
        int rres=maxSum(node.right);
        
        int maxBT=Math.max(lres,rres);
        int mySum=node.val;
        
        if(maxBT>=0){
            mySum=maxBT+node.val;
            
            max=Math.max(max,lres+rres+node.val);
        }
        
        max=Math.max(max,mySum);
        
        return mySum;
    }
}