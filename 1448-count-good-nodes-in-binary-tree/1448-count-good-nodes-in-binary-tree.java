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
        count=0;
        
        countGoodNodes(root,-10001);
        return count;
    }
    
    public void countGoodNodes(TreeNode node, int maxPathVal){
        if(node==null){
            return;
        }
        
        if(node.val>=maxPathVal){
            count++;
            maxPathVal=node.val;
        }
        
        countGoodNodes(node.left,maxPathVal);
        countGoodNodes(node.right,maxPathVal);
    }
}