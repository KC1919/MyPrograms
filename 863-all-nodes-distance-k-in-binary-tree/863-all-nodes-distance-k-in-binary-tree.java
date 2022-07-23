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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<TreeNode>list=new ArrayList<>();
        
        nodeRootPath(root,list,target);
        
        List<Integer>klist=new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            List<Integer>temp=new ArrayList<>();
            
            TreeNode block=i>0?list.get(i-1):null;
            getNodes(list.get(i),temp,k-i,block);
            
            if(temp.size()>0){
                klist.addAll(temp);
            }
        }
        
        return klist;
    }
    
    private boolean nodeRootPath(TreeNode node, ArrayList<TreeNode>list, TreeNode target){
        
        if(node==null){
            return false;
        }
        
        if(node==target){
            list.add(node);
            return true;
        }
        
        boolean lres=nodeRootPath(node.left,list,target);
        
        if(lres){
            list.add(node);
            return true;
        }
        boolean rres=nodeRootPath(node.right,list,target);
        
        if(rres){
            list.add(node);
            return true;
        }
        
        return false;
    }
    
    private void getNodes(TreeNode node, List<Integer>list, int level,TreeNode block){
        
        if(node==null || node==block){
            return;
        }
        
        if(level==0){
            list.add(node.val);
            return;
        }
        
        getNodes(node.left,list,level-1,block);
        getNodes(node.right,list,level-1,block);
    }
}