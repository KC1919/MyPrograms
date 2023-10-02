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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double>res=new ArrayList<>();

        if(root==null) return res;

        Queue<TreeNode>que=new LinkedList<>();

        que.add(root);

        while(que.size()>0){
            int size=que.size();
            int count=size;
            double sum=0;
            while(size-->0){
                TreeNode rem=que.remove();
                sum+=rem.val;

                if(rem.left!=null) que.add(rem.left);
                if(rem.right!=null) que.add(rem.right);
            }
            res.add(sum/count);
        }
        return res;
    }
}