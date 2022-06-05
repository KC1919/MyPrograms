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
        
        //maximum between the left result and right result
        int max=Math.max(lres,rres);
        int myPathSum=node.val;
        
        //if the maximum is not negative
        if(max>=0){
            
            //if both lres and rres are positive then we add both to the myPathSum
            if(lres>=0 && rres>=0)
                myPathSum+=lres+rres;
            
            //else if any one is negative
            //we add the positive one
            else
                myPathSum+=max;
        }
            
        //we compare the maximum sum so far and compare it with our current
        //pathSum and update accordingly
        maxSum=Math.max(maxSum,myPathSum);
        
        //and we return to the above node, the path that will lead to the
        //maximum sum
        
        //so we check if the max of the left and right result is positive
        //then we add ourself(current node's value to the max) and return
        //else if the max is negative so we only return the current node's value
        //because adding negative would minimize the path sum
        return max>=0?max+node.val:node.val;
    }
}