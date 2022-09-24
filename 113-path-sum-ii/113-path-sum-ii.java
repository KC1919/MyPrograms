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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>>res=pathSumAll(root,targetSum,0);
        
        for(List<Integer>list:res){
            Collections.reverse(list);
        }
        return res;
    }
    
    private List<List<Integer>> pathSumAll(TreeNode node, int target, int sum){
        
        if(node==null){
            return new ArrayList<>();
        }
        
        List<List<Integer>>myRes=new ArrayList<>();
        if(node.left==null && node.right==null){
            
            if(sum+node.val==target){
                myRes.add(new ArrayList<>());
                myRes.get(0).add(node.val);
            }
            return myRes;
        }
        
        List<List<Integer>>lres=pathSumAll(node.left,target,sum+node.val);
        List<List<Integer>>rres=pathSumAll(node.right,target,sum+node.val);
        
        if(lres.size()>0){
            for(List<Integer>list:lres){
                list.add(node.val);
                myRes.add(list);
            }
        }
        
        if(rres.size()>0){
            for(List<Integer>list:rres){
                list.add(node.val);
                myRes.add(list);
            }
        }
        
        return myRes;
    }
}