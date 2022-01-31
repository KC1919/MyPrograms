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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        
        traverse(root1,list1);
        traverse(root2,list2);
        
        int i=0, j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        
        
        while(list1.size()!=0 && list2.size()!=0)
        {
            if(list1.get(0)<=list2.get(0))
            {
                ans.add(list1.remove(0));
            }
            
            else if(list1.get(0)>list2.get(0))
            {
                ans.add(list2.remove(0));
            }
        }
        
        while(list1.size()!=0)
        {
            ans.add(list1.remove(0));
        }
        
        while(list2.size()!=0)
        {
            ans.add(list2.remove(0));
        }
        
        return ans;
    }
    
    public void traverse(TreeNode node, ArrayList<Integer>list)
    {
        if(node==null)
            return;
        
        traverse(node.left,list);
        list.add(node.val);
        traverse(node.right,list);
    }
}