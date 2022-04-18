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
        Stack<TreeNode>st=new Stack<>();
        
        st.push(node);
        
        while(true)
        {
            while(node!=null)
            {
                node=st.peek();
                
                if(node.left!=null)
                    st.push(node.left);
                
                node=node.left;
            }
            
            node=st.pop();
            
            if(k--==1){
                return node.val;
            }
            if(node.right!=null)
                st.push(node.right);
            
            node=node.right;
        }
    }
}