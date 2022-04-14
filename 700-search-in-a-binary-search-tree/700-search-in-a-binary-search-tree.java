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
    public TreeNode searchBST(TreeNode node, int val) {
        if(node==null)
            return node;
        
        if(node.val==val)
            return node;
        
        if(node.val>val){
            TreeNode lres=searchBST(node.left,val);
            if(lres!=null)
                return lres;
        }
        else if(node.val<val){
            TreeNode rres=searchBST(node.right,val);
            if(rres!=null)
                return rres;
        }
        
        return null;
    }
}