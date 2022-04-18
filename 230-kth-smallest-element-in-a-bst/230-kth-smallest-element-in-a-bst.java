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
    public int c=0;
    public int kthSmallest(TreeNode node, int k) {
        c=k;
        return kthSmall(node);
    }
    
    public int kthSmall(TreeNode node)
    {
        if(node==null)return -1;
        
        int lres=kthSmall(node.left);
        if(lres!=-1)return lres;
        
        c-=1;
        if(c==0)return node.val;
        
        int rres=kthSmall(node.right);
        
        if(rres!=-1)
            return rres;
        
        return -1;
    }
}