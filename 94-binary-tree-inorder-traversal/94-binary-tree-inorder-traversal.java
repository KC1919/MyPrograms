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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer>list=new ArrayList<>();
        
        TreeNode node=root;
        
        Stack<TreeNode>st=new Stack<>();
        
        while(st.size()>0 || node!=null){
            
            while(node!=null){
                st.push(node);
                node=node.left;
            }
            
            node=st.pop();
            
            list.add(node.val);
            
            node=node.right;
        }
        
        return list;
    }
}