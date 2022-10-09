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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        
        List<Integer>list=new ArrayList<>();
        
        inorder(root,list);
        
        int left=0, right=list.size()-1;
        
        while(left<right){
            int lval=list.get(left);
            int rval=list.get(right);
            
            if(lval+rval==k){
                return true;
            }
            
            else if(lval+rval>k){
                right--;
            }
            
            else if(lval+rval<k){
                left++;
            }
        }
        return false;
    }
    
    private void inorder(TreeNode node, List<Integer>list){
        if(node==null){
            return;
        }
        
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}