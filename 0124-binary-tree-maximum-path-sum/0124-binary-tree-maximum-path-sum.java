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
    int maxSum=-1001;
    public int maxPathSum(TreeNode root) {
        maxSum=-1001;
        maxPath(root);
        return maxSum;
    }

    private int maxPath(TreeNode node){
        if(node==null) return Integer.MIN_VALUE;

        int mySum=0;
        int lres=maxPath(node.left);
        int rres=maxPath(node.right);

        mySum=Math.max(lres,rres);

        if(lres!=Integer.MIN_VALUE){
            maxSum=Math.max(maxSum,lres);
            maxSum=Math.max(maxSum,lres+node.val);
        }

        if(rres!=Integer.MIN_VALUE){
            maxSum=Math.max(maxSum,rres);
            maxSum=Math.max(maxSum,rres+node.val);
        }

        if(lres!=Integer.MIN_VALUE && rres!=Integer.MIN_VALUE){
            maxSum=Math.max(maxSum,lres+rres+node.val);
        }

        maxSum=Math.max(maxSum,node.val);
        
        return (mySum==Integer.MIN_VALUE)?node.val:Math.max(mySum+node.val,node.val);
    }
}