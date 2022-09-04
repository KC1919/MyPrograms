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
    
    class Pair
    {
        int vlevel;
        int hlevel;
        TreeNode node;
        
        Pair(TreeNode node, int vlevel, int hlevel){
            this.node=node;
            this.vlevel=vlevel;
            this.hlevel=hlevel;
        }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        int wid[]=new int[2];
        width(root,0,wid);
        
        int maxWidth=wid[1]-wid[0]+1;
        
        Queue<Pair>que=new LinkedList<>();
        
        List<List<Pair>>list=new ArrayList<>();
        
        for(int i=0;i<maxWidth;i++){
            list.add(new ArrayList<>());
        }
        
        int rootLevel=Math.abs(wid[0]);
        
        que.add(new Pair(root,rootLevel,0));
        
        while(que.size()>0){
            
            int size=que.size();
            
            while(size-->0){
                
                Pair rem=que.remove();
                
                list.get(rem.vlevel).add(rem);
                
                if(rem.node.left!=null){
                    que.add(new Pair(rem.node.left,rem.vlevel-1,rem.hlevel+1));
                }
                
                if(rem.node.right!=null){
                    que.add(new Pair(rem.node.right,rem.vlevel+1,rem.hlevel+1));
                }
            }
        }
        
        for(List<Pair>item:list){
            Collections.sort(item,(a,b)->{
                if(a.hlevel==b.hlevel)return a.node.val-b.node.val;
                
                else return 0;
            });
        }
        
        List<List<Integer>>res=new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            res.add(new ArrayList<>());
        }
        
        for(List<Pair>item:list){
            
            for(Pair p:item){
                res.get(p.vlevel).add(p.node.val);
            }
        }
        
        return res;
    }
    
    private void width(TreeNode node, int level, int wid[]){
        
        if(node==null){
            return;
        }
        
        wid[0]=Math.min(wid[0],level);
        wid[1]=Math.max(wid[1],level);
        
        width(node.left,level-1,wid);
        width(node.right,level+1,wid);
    }
}