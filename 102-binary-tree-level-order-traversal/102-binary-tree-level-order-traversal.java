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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root==null)
            return new ArrayList<>();
        
        List<List<Integer>>res=new ArrayList<>();
        
        Queue<TreeNode>que=new LinkedList<>();
        
        que.add(root);
        
        int level=0;
        
        while(que.size()>0){
            int size=que.size();
            
            res.add(new ArrayList<>());
            while(size-->0){
                
                TreeNode rem=que.remove();
                res.get(level).add(rem.val);
                
                if(rem.left!=null)
                    que.add(rem.left);
                
                if(rem.right!=null)
                    que.add(rem.right);
                
            }
            level++;
        }
        return res;
    }
}