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
    public List<Integer> rightSideView(TreeNode root) {
        
        if(root==null)
            return new ArrayList<>();
        
        Queue<TreeNode>que=new LinkedList<>();
        List<Integer>list=new ArrayList<>();
        
        que.add(root);
        
        int level=0;
        
        while(que.size()>0){
            int size=que.size();
            
            //traversing the nodes of a particular level
            for(int i=size;i>0;i--){
                
                TreeNode rem=que.remove();
                
                if(i==size)
                    list.add(rem.val); //adding to the list
                
                if(rem.right!=null)
                    que.add(rem.right);
                
                if(rem.left!=null)
                    que.add(rem.left);
                
            }
        }
        return list;
    }
}