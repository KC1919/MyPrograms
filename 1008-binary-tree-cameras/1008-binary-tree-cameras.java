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
    int cameras=0;
    public int minCameraCover(TreeNode root) {
        if(root==null) return 0;

        if(placeCameras(root)==-1) cameras++;

        return cameras;
    }

    private int placeCameras(TreeNode node){
        if(node==null) return 1;

        int lchild=placeCameras(node.left);
        int rchild=placeCameras(node.right);

        if(lchild==-1 || rchild==-1){
            cameras++;
            return 0;
        }

        if(lchild==0 || rchild==0) return 1;

        return -1;
    }
}