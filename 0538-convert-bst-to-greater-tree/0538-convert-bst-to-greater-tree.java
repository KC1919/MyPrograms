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
    int count=0;
    public TreeNode convertBST(TreeNode node) {
        List<Integer>list=new ArrayList<>();
        inorder(node,list);
        
        for(int i=list.size()-2;i>=0;i--)
        {
            list.set(i,list.get(i+1)+list.get(i));
        }
        
        count=0;
        rightSum(node,list);
        
        return node;
    }
    
    public void inorder(TreeNode node, List<Integer>list)
    {
        if(node==null)return;
        
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
    
    public void rightSum(TreeNode node, List<Integer>list)
    {
        if(node==null)return;
        
        rightSum(node.left,list);
        node.val=list.get(count);
        count++;
        rightSum(node.right,list);
    }
}