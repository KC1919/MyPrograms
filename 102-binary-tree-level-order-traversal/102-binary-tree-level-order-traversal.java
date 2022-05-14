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
            
            //list to store nodes of a particular level
            List<Integer>list=new ArrayList<>();
            
            //traversing the nodes of a particular level
            while(size-->0){
                
                TreeNode rem=que.remove();
                list.add(rem.val); //adding to the list
                
                //adding nodes of the next level
                if(rem.left!=null)
                    que.add(rem.left);
                
                if(rem.right!=null)
                    que.add(rem.right);
                
            }
            //incrementing the level, means moving to the next level
            level++;
            
            //adding the list of nodes of a particular level to the resultant list
            res.add(list);
        }
        return res;
    }
}