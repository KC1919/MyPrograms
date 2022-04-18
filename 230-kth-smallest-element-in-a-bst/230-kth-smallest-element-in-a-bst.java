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
        
        //iterative inorder traversal
        Stack<TreeNode>st=new Stack<>();
        
        while(true)
        {
            //Preorder
            while(node!=null){
                st.push(node);
                node=node.left;
            }
        
            node=st.pop();
            
            //Inorder
            if(--k==0)
                return node.val;
            
            node=node.right;
            
            //Postorder
        }
    }
}