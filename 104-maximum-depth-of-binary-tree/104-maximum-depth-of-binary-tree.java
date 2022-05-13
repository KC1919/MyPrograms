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
    public int maxDepth(TreeNode node) {
        if(node==null)
            return 0;
        
        int lh=maxDepth(node.left); //getting the height from the left subtree
        int rh=maxDepth(node.right);//getting the height from the right subtree
        int mh=Math.max(lh,rh)+1;   //adding our height tot he max among the left and the
                                    //right height
        
        return mh;   //returning the height to the above node
    }
}