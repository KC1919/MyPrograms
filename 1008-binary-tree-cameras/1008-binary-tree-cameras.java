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

/*

1 denotes the node is covered by a camera
0 denotes the node has a camera
-1 denotes the node requires coverage

- if a node is covered by any of its child, it does not need a camera, so it returns 1, stating its covered

- if any of node's child needs a camera, then the node has to install a camera, so we increase the count by 1, and return 0, meaning a camera was installed

- if the both the child nodes are covered or have camera, so the node does not install a camera, instead it asks its parent node that it wants to be covered, so it returns -1

*/