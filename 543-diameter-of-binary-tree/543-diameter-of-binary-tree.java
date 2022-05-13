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
        int maxdia;
        
        Pair(){
            myheight=0;
            maxdia=0;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Pair result=maxDia(root);
        return result.maxdia;
    }
    
    public Pair maxDia(TreeNode node){
        if(node==null){
            return new Pair();
        }
        
        Pair p=new Pair();
        
        Pair lres=maxDia(node.left);
        Pair rres=maxDia(node.right);
        
        int maxdia=Math.max(lres.maxdia,rres.maxdia);
        int myheight=Math.max(lres.myheight,rres.myheight)+1;
        
        int mydia=lres.myheight+rres.myheight;
        
        p.myheight=myheight;
        p.maxdia=Math.max(mydia,maxdia);
        
        return p;
    }
}