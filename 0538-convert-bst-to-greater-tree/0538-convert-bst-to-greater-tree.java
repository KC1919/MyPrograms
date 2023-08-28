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

    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return root;

        greaterTree(root);
        return root;
    }

    public void greaterTree(TreeNode node){

        if(node==null){
            return;
        }

        int mySum=0;

        greaterTree(node.right);

        // mySum+=rsum;
        mySum+=node.val;
        sum+=mySum;

        node.val=sum;

        // System.out.println("Before left call: "+node.val+"-"+mySum);

        greaterTree(node.left);

        // System.out.println(node.val+"-"+mySum);

        // return node.val=sum;
    }
}