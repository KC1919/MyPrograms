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
    public TreeNode deleteNode(TreeNode node, int key) 
    {
        if(node==null)
            return null;
        
        if(node.val==key)
        {
            if(node.left==null && node.right==null)
                return null;
            
            else if(node.left!=null && node.right==null)
                return node.left;
            
            else if(node.left==null && node.right!=null)
                return node.right;
            
            else
            {
                int max=findMax(node.left);
                node.val=max;
                node.left=deleteNode(node.left,max);
            }
        }
        
        else if(key<node.val)
        {
            node.left=deleteNode(node.left,key);
        }
        
        else
        {
            node.right=deleteNode(node.right,key);
        }
        return node;
    }
    
    public int findMax(TreeNode node)
    {
        if(node.right!=null)
            return findMax(node.right);
        else
            return node.val;
    }
}