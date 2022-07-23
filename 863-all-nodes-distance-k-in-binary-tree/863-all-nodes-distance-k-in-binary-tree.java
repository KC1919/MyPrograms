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
        
        List<Integer>klist=new ArrayList<>();
        
        nodeRootPath(root,target,klist,k);
        
//         for(int i=0;i<list.size();i++){
//             List<Integer>temp=new ArrayList<>();
            
//             TreeNode block=i>0?list.get(i-1):null;
//             getNodes(list.get(i),temp,k-i,block);
            
//             if(temp.size()>0){
//                 klist.addAll(temp);
//             }
//         }
        
        return klist;
    }
    
    private int nodeRootPath(TreeNode node, TreeNode target, List<Integer>klist, int k){
        
        if(node==null){
            return 0;
        }
        
        if(node==target){
            // List<Integer>temp=new ArrayList<>();
            getNodes(node,klist,k,null);
            // klist.addAll(temp);
            
            return 1;
        }
        
        int lres=nodeRootPath(node.left,target,klist,k);
        
        if(lres>0){
            // List<Integer>temp=new ArrayList<>();
            getNodes(node,klist,k-lres,node.left);
            // klist.addAll(temp);
            return lres+1;
        }
        
        int rres=nodeRootPath(node.right,target,klist,k);
        
        if(rres>0){
            // List<Integer>temp=new ArrayList<>();
            getNodes(node,klist,k-rres,node.right);
            // klist.addAll(temp);
            return rres+1;
        }
        
        return 0;
    }
    
    private void getNodes(TreeNode node, List<Integer>list, int level,TreeNode block){
        
        if(node==null || node==block || level<0){
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