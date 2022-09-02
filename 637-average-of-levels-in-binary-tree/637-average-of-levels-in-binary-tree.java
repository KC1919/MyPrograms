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
        
        List<List<Integer>>list=new ArrayList<>();
        
        collectNodes(root,0,list);
        
        List<Double>res=new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            double sum=0;
            for(int ele:list.get(i)){
                sum+=ele;
            }
            
            res.add(sum/list.get(i).size());
        }
        return res;
    }
    
    public void collectNodes(TreeNode node, int level, List<List<Integer>>list){
        if(node==null){
            return;
        }
        
        if(level==list.size()){
            list.add(new ArrayList<>());
        }
        
        list.get(level).add(node.val);
        
        collectNodes(node.left,level+1,list);
        collectNodes(node.right,level+1,list);
    }
}