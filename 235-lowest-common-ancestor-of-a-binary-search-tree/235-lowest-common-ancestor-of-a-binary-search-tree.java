/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return traverse(root,p,q);
    }
    
    public TreeNode traverse(TreeNode node, TreeNode p, TreeNode q){
        
        if(node==null)
            return null;
        
        if(p.val<node.val && q.val<node.val)
            return traverse(node.left,p,q);
        
        else if(p.val>node.val && q.val>node.val)
            return traverse(node.right,p,q);
        
        else
            return node;
    }
}