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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        helper(root,targetSum,0,res,list);
        return res;
        
    }
    
    public void helper(TreeNode node, int target, int sum, List<List<Integer>>res, List<Integer>list)
    {
        if(node==null)
            return;
        
        sum+=node.val;
        list.add(node.val);
        
        if(node.left==null && node.right==null)
        {
            if(sum==target){
                res.add(new ArrayList<>(list));
            }
            list.remove(list.size()-1); 
            return;
        }
        
        helper(node.left,target,sum,res,list);   
        helper(node.right,target,sum,res,list);
        list.remove(list.size()-1);
        
    }
}