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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        
        addNode(root,val,depth,1);
        
        return root;
    }
    
    private void addNode(TreeNode node, int val, int depth, int currDepth){
        
        if(node==null){
            return;
        }
        
        if(currDepth==depth-1){
            TreeNode tleft=node.left;
            node.left=new TreeNode(val);;
            node.left.left=tleft;
            
            TreeNode tright=node.right;
            node.right=new TreeNode(val);;
            node.right.right=tright;
        }
        else{
            addNode(node.left,val,depth,currDepth+1);
            addNode(node.right,val,depth,currDepth+1);
        }
    }
}