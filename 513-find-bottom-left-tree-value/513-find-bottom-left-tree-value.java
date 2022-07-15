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
    public int findBottomLeftValue(TreeNode root) {
        
        int depth=maxDepth(root)-1;
        Queue<TreeNode>que=new LinkedList<>();
        
        que.add(root);
        
        int level=0;
        
        while(que.size()>0){
            int size=que.size();
            int flag=0;
            
            while(size-->0){
                
                TreeNode rem=que.remove();
                
                if(level==depth){
                    return rem.val;
                }
                
                if(rem.left!=null){
                    que.add(rem.left);
                    flag=1;
                }
                
                if(rem.right!=null){
                    que.add(rem.right);
                    flag=1;
                }
            }
            
            if(flag==1){
                level++;
            }
        }
        return root.val;
    }
    
    private int maxDepth(TreeNode node){
        if(node==null){
            return 0;
        }
        
        int lres=maxDepth(node.left);
        int rres=maxDepth(node.right);
        
        return Math.max(lres,rres)+1;
    }
}