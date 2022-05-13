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
        
        //made my pair
        Pair p=new Pair();
        
        //got the result from the left subtree
        Pair lres=maxDia(node.left);
        
        //got the result fromt he right subtree
        Pair rres=maxDia(node.right);
        
        //calculated the max diameter so far
        int maxdia=Math.max(lres.maxdia,rres.maxdia);
        
        //calculated the max height from the left and right result
        int myheight=Math.max(lres.myheight,rres.myheight)+1;
        
        //calculated my diameter
        int mydia=lres.myheight+rres.myheight;
        
        //stored the height in myheight variable of the pair class
        p.myheight=myheight;
        
        //then checked if my diameter is greater than the max diameter so far
        //so update the max diameter varible with my diameter value, else put the
        //max diameter value so far in it
        p.maxdia=Math.max(mydia,maxdia);
        
        return p; //finally return the pair of information to the above node
    }
}