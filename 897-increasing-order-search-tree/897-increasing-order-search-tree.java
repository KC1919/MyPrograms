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
    public TreeNode temp;
    public TreeNode increasingBST(TreeNode node) {
        
        if(node==null)
            return node;
        
        temp=null;
        inorder(node);
        
        return temp;
    }
    public void inorder(TreeNode node)
    {
        if(node==null)
            return;
        
        inorder(node.right);
        node.right=temp;
        temp=node;
        inorder(node.left);
        node.left=null;
    }
}