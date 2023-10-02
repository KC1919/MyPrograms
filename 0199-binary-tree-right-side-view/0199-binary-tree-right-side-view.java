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

        List<Integer>res=new ArrayList<>();

        if(root==null) return res;

        Queue<TreeNode>que=new LinkedList<>();

        que.add(root);
        
        while(que.size()>0){
            int size=que.size();

            while(size>0){

                TreeNode rem=que.remove();
                if(size==1){
                    res.add(rem.val);
                }

                if(rem.left!=null){
                    que.add(rem.left);
                }

                if(rem.right!=null){
                    que.add(rem.right);
                }

                size--;
            }
        }
        return res;
    }
}