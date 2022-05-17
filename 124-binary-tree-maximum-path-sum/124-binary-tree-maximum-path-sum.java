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
    
    class res
    {
        int max=Integer.MIN_VALUE;
    }
    
    public int maxPathSum(TreeNode root) 
    {
        res a=new res();
        helper(root,a);
        return a.max;
        
    }
    
    public int helper(TreeNode node, res a)
    {
        if(node==null)
            return 0;
        
        int ldata=helper(node.left,a);
        int rdata=helper(node.right,a);
        
        int max_single = Math.max(Math.max(ldata, rdata) + node.val,
                                  node.val);
        
        int max_top = Math.max(max_single, ldata + rdata + node.val);
        
        a.max = Math.max(a.max, max_top);
 
        return max_single;
    }
}