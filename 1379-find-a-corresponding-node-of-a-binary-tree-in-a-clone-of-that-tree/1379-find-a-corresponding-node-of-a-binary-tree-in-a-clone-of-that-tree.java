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
    TreeNode node=null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        node=null;
        
        helper(original,cloned,target);
        return node;
    }
    
    public void helper(TreeNode n1, TreeNode n2, TreeNode target){
        
        if(n1==null && n2==null)
            return;
        
        if(n1.val==target.val && n2.val==target.val)
        {
            node=n2;
            return;
        }
        
        helper(n1.left,n2.left,target);
        helper(n1.right,n2.right,target);
    }
}