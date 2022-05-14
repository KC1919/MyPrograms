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
    
    TreeNode lca=null;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        lca=null;
        traverse(root,p,q);
        
        return lca;
    }
    
    public void traverse(TreeNode node, TreeNode p, TreeNode q){
        
        if(node==null)
            return;
        
        if(p.val<node.val && q.val<node.val)
            traverse(node.left,p,q);
        
        else if(p.val>node.val && q.val>node.val)
            traverse(node.right,p,q);
        
        else{
            lca=node;
            return;
        }
    }
}