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
    public TreeNode deleteNode(TreeNode node, int key) {
        
        if(node==null)return null;
        
        if(node.val==key){
            
            if(node.left==null && node.right==null)return null;
            
            else if(node.left!=null && node.right==null)
                return node.left;
            
            else if(node.left==null && node.right!=null)
                return node.right;
            
            else{
                 TreeNode rmin=getRightMin(node.right);
                 node.val=rmin.val;
                 node.right=deleteNode(node.right,rmin.val);
            }
        }
        
        node.left=deleteNode(node.left,key);
        node.right=deleteNode(node.right,key);
        
        return node;
    }
    
    private TreeNode getRightMin(TreeNode node){
        if(node.left!=null)return getRightMin(node.left);
        else return node;
    }
}