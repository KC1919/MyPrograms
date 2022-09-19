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
            if(node.right!=null){
                TreeNode rmin=getRightMin(node.right);
                node.val=rmin.val;
                node.right=deleteNode(node.right,rmin.val);
            }
            
            else if(node.left!=null){
                TreeNode lmax=getLeftMax(node.left);
                node.val=lmax.val;
                node.left=deleteNode(node.left,lmax.val);
            }
            
            else{
                return null;
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
    
    private TreeNode getLeftMax(TreeNode node){
        if(node.right!=null)return getLeftMax(node.right);
        else return node;
    }
}