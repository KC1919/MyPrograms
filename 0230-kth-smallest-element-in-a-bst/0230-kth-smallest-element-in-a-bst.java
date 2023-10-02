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
    int level=0;
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null) return -1;

        int lres=kthSmallest(root.left,k);

        if(lres>=0) return lres;

        level++;

        if(k==level){
            return root.val;
        }

        int rres=kthSmallest(root.right,k);

        if(rres>=0) return rres;

        return -1;
    }
}