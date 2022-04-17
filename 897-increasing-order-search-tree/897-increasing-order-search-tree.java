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
    public TreeNode increasingBST(TreeNode node) {
        
        if(node==null)
            return node;
        
        List<TreeNode>list=new ArrayList<>();
        inorder(node,list);
        for(int i=list.size()-1;i>=0;i--)
        {
            TreeNode n=list.get(i);
            n.left=null;
            n.right=null;
            
            if(i<list.size()-1){
                n.right=list.get(i+1);
            }
        }
        return list.get(0);
    }
    public void inorder(TreeNode node, List<TreeNode>list)
    {
        if(node==null)
            return;
        
        inorder(node.left,list);
        list.add(node);
        inorder(node.right,list);
    }
}