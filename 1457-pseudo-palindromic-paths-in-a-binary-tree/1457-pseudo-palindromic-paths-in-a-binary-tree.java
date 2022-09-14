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
    int count=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        
        count=0;
        findPalins(root,new HashMap<>(),0);
        return count;
    }
    
    private void findPalins(TreeNode node, HashMap<Integer,Integer>hm, int depth){
        
        if(node==null){
            return;
        }
        
        if(node.left==null && node.right==null){
            
            hm.put(node.val,hm.getOrDefault(node.val,0)+1);
            
            int flag=0;
            if(depth%2!=0){
                
                flag=0;
                for(int key:hm.keySet()){
                    if(hm.get(key)%2!=0){
                        flag=1;
                        break;
                    }
                }
                
                if(flag==0){
                    count++;
                }
            }
            
            else{
                
                flag=0;
                int oc=0;
                for(int key:hm.keySet()){
                    if(hm.get(key)%2!=0){
                        oc++;
                    }
                    if(oc>1){
                        break;
                    }
                }
                
                if(oc==1){
                    count++;
                }
            }
            hm.put(node.val,hm.get(node.val)-1);
            return;
        }
        
        hm.put(node.val,hm.getOrDefault(node.val,0)+1);
        
        findPalins(node.left,hm,depth+1);
        findPalins(node.right,hm,depth+1);
        
        hm.put(node.val,hm.get(node.val)-1);
        
        return;
    }
}