/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        ArrayList<TreeNode>p1=new ArrayList<>();
        ArrayList<TreeNode>p2=new ArrayList<>();
        getpath(root,p,p1);
        getpath(root,q,p2);
        
        int i=p1.size()-1;
        int j=p2.size()-1;
        
        while(i>=0 && j>=0 && p1.get(i)==p2.get(j))
        {
            i--;
            j--;
        }
        
        return p1.get(i+1);
    }
    
    
    boolean getpath(TreeNode node,TreeNode target,ArrayList<TreeNode> list)
    {
        if(node==null)
            return false;
        
        if(node==target)
        {
            list.add(node);
            return true;
        }
        
        boolean lc=getpath(node.left,target,list);
        if(lc==true)
        {
            list.add(node);
            return true;
        }
        boolean rc=getpath(node.right,target,list);
        if(rc==true)
        {
            list.add(node);
            return true;
        }
        
        return false;
            
    }
}