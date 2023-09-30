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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;

        sum=0;
        getSum(root,0);

        return sum;
    }

    public void getSum(TreeNode node, int prev){
        if(node==null) return;

        if(node.left==null && node.right==null){
            sum=sum+(prev+node.val);
        }

        if(node.left!=null){
            getSum(node.left, (prev+node.val)*10);
        }

        if(node.right!=null){
            getSum(node.right, (prev+node.val)*10);
        }
    }
}