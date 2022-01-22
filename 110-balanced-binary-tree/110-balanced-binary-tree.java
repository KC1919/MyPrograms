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
    
    class Pair
    {
        int height=0;
        boolean balanced=true;
    }
    
    public boolean isBalanced(TreeNode root) 
    {
        if(root==null)
            return true;
        
        Pair result=check(root);
        
        return result.balanced;
    }
    
    public Pair check(TreeNode node)
    {
        if(node==null)
        {
            return new Pair();
        }
        
        Pair p=new Pair();
        
        Pair lr=check(node.left);
        
        if(lr.balanced==false)
        {
            p.balanced=false;
            return p;
        }
        
        Pair rr=check(node.right);
        
        if(rr.balanced==false)
        {
            p.balanced=false;
            return p;
        }
        
        if(Math.abs(lr.height-rr.height)>1)
        {
            p.balanced=false;
            return p;
        }
        
        p.height=Math.max(lr.height,rr.height)+1;
        
        return p;
    }
}