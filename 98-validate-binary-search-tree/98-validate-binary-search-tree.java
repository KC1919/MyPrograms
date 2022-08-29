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
        TreeNode node;
        boolean isBST=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
    }
    
    public boolean isValidBST(TreeNode root) {
        
        if(root.left==null && root.right==null){
            return true;
        }
        
        Pair res=helper(root);
        return res.isBST;
    }
    
    private Pair helper(TreeNode node){
        
        if(node==null){
            return new Pair();
        }
        
        Pair lres=helper(node.left);
        Pair rres=helper(node.right);
        
        Pair myres=new Pair();
        
        myres.isBST=(lres.isBST && rres.isBST) && (node.val>lres.max && node.val<rres.min);
        
        myres.min=Math.min(node.val,Math.min(lres.min,rres.min));
        myres.max=Math.max(node.val,Math.max(lres.max,rres.max));
        
        return myres;
    }
}