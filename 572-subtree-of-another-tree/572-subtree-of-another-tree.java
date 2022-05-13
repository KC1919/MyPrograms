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
    public boolean isSubtree(TreeNode node, TreeNode subnode) {
        
        if(node.left==null && node.right==null && subnode.left==null && subnode.right==null&& node.val!=subnode.val)
            return false;
        
        return helper(node,subnode);
    }
    
    public boolean helper(TreeNode node, TreeNode subnode){
        
        if(node==null)
            return false;
        
        boolean res=true;
        if(node.val==subnode.val){
            
            res=isSameTree(node,subnode);
            if(res==true){
                return true;
            }   
        }
        
        boolean lres=helper(node.left,subnode);
        if(lres==true)
            return true;
        
        boolean rres=helper(node.right,subnode);
        if(rres==true)
            return true;
        
        return false;
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        //if both the nodes reach null then return true, shows similarity in structure
        if(p==null && q==null)
            return true;
        
        //if any one node is null and another node is not null, return false
        //because this shows dissimilarity in their structure
        if((p==null && q!=null) || (q==null && p!=null))
            return false;
        
        //or if the values of the nodes is not same then also they are not identical
        //and we return false
        if(p.val!=q.val)
            return false;
        
        //get the result from left subtree
        boolean lres=isSameTree(p.left,q.left);
        if(lres==false)  //if false received
            return false;  //return false, no need to check right subtree
        
        //if false is received from the right subtree
        boolean rres=isSameTree(p.right,q.right); 
        if(rres==false)    //then also we return false
            return false;
        
        //if reach till end, means till this statement, that measn all the conditions
        //of identical trees were true hence we return true
        return true;
    }
}