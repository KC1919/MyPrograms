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
    public int kthSmallest(TreeNode node, int k) {
        
        if(node==null)
            return 0;
        
        Stack<TreeNode>st=new Stack<>();
        
        
        
        while(true){
            
            while(node!=null){
                st.push(node);
                node=node.left;
            }
            
            node=st.pop();
            
            if(k==1)
                return node.val;
            
            k--;
            
            node=node.right;
        }
    }
}