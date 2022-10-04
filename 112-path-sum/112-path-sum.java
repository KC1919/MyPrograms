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
    public boolean hasPathSum(TreeNode node, int targetSum) {
        
        if(node==null){
            return false;
        }
        
        if(node.left==null && node.right==null && targetSum==node.val){
            return true;
        }
        
        boolean lres=hasPathSum(node.left,targetSum-node.val);
        if(lres){
            return true;
        }
        
        boolean rres=hasPathSum(node.right,targetSum-node.val);
        
        if(rres){
            return true;
        }
        
        return false;
    }
}