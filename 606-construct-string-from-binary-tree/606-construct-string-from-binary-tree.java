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
    public String tree2str(TreeNode root) {
        return helper(root);
    }
    
    private String helper(TreeNode node){
        
        if(node==null){
            return "";
        }
        
        if(node.left==null && node.right==null){
            return node.val+"";
        }
        
        StringBuilder myres=new StringBuilder();
        
        String lres=helper(node.left);
        
        myres.append("(");
        myres.append(lres);
        myres.append(")");
        
        if(node.right!=null){
            String rres=helper(node.right);
            myres.append("(");
            myres.append(rres);
            myres.append(")");
        }
        
        myres.insert(0,node.val);
        
        return myres.toString();
    }
}