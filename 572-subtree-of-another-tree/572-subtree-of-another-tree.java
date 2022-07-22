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
        
       if(node==null)
            return false;
        
        //taking a status variable
        boolean res=true; //by default setting it to true
                         //this variable helps to deal with duplicates
                         //because there can be many nodes with same value as
                         //that of the root node of the subtree
                         //so whenever we encounter any node with same value as that of
                         //the root node of the subtree, we make a call to are checkSame
                         //function to check for similarity
        
        //if the subtree root node value matches with current node value of the main tree
        if(node.val==subnode.val){
            
            //then we pass the two nodes in to the isSameTree function
            //which checks for similarity of both the trees with structure and values both
            res=isSameTree(node,subnode);
            
            //if true is returned measn the subtree is valid in main tree
            if(res==true){
                return true; //we return true, without making any further calls
            }   
        }
        
        //else if the is identical function return false
        
        //we make callto the left subtree
        boolean lres=isSubtree(node.left,subnode);
        
        //check the result got from the left subtree
        if(lres==true)   //if its true we return true without making call 
            return true; //to the right subtree
            
        //if true is received from the right subtree
        boolean rres=isSubtree(node.right,subnode);
        if(rres==true)
            return true; //we return true
        
        return false; //else we return false
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        //if both the nodes reach null then return true, shows similarity in structure
        if(p==null && q==null)
            return true;
        
        //if any one node is null and another node is not null, return false
        //because this shows dissimilarity in their structure
        if(p==null || q==null)
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