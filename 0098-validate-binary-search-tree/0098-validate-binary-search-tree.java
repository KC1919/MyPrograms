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
    
    class BSTPair{
        long min;
        long max;
        boolean isBST;
    }

    public boolean isValidBST(TreeNode root) {  
        if(root==null) return true;

        BSTPair result=checkBST(root); 

        return result.isBST;
    }

    private BSTPair checkBST(TreeNode node){

        if(node==null){
            BSTPair mp=new BSTPair();
            mp.min=Long.MAX_VALUE;
            mp.max=Long.MIN_VALUE;
            mp.isBST=true;

            return mp;
        }

        BSTPair lp=checkBST(node.left);
        BSTPair rp=checkBST(node.right);

        BSTPair mp=new BSTPair();

        mp.isBST= lp.isBST && rp.isBST && (node.val>lp.max && node.val<rp.min) ;

        mp.min=Math.min(lp.min, Math.min(rp.min,node.val));
        mp.max=Math.max(lp.max, Math.max(rp.max,node.val));

        return mp;
    }
}