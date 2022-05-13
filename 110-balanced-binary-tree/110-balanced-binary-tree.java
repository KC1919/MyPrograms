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
        int myheight;
        boolean isBalanced;
        
        Pair(){
            myheight=0;
            isBalanced=true;
        }
    }
    public boolean isBalanced(TreeNode root) {
        
        Pair result=check(root);
        return result.isBalanced;
    }
    
    public Pair check(TreeNode node){
        if(node==null)
            return new Pair();
        
        Pair p=new Pair();
        
        Pair lres=check(node.left);
        Pair rres=check(node.right);
        
        p.myheight=Math.max(lres.myheight,rres.myheight)+1;
        
        int diff=Math.abs(lres.myheight-rres.myheight);
        
        if(lres.isBalanced==false || rres.isBalanced==false || diff>1)
            p.isBalanced=false;
        
        return p;
    }
}