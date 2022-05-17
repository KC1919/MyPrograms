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
    public final TreeNode getTargetCopy(final TreeNode n1, final TreeNode n2, final TreeNode target) {
        
        if(n1==null)
            return null;
        
        if(target==n1)
            return n2;
        
        TreeNode lres=getTargetCopy(n1.left,n2.left,target);
        
        if(lres!=null)
            return lres;
        TreeNode rres=getTargetCopy(n1.right,n2.right,target);
        
        if(rres!=null)
            return rres;
        
        return null;
    }
}