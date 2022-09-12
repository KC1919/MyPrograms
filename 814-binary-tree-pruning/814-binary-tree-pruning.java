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
    public TreeNode pruneTree(TreeNode node) {
        
        if(node!=null && node.left==null && node.right==null && node.val==0){
            return null;
        }
        
        boolean res=prune(node);
        
        if(res==false && node.val==0)return null;
        
        return node;
    }
    
    private boolean prune(TreeNode node){
        
        if(node==null){
            return false;
        }
        
        boolean lres=prune(node.left);
        
        if(lres==false){
            node.left=null;
        }
        
        boolean rres=prune(node.right);
        
        if(rres==false){
            node.right=null;
        }
        
        if(lres==false && rres==false && node.val==0)return false;
        
        return true;
    }
}