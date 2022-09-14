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
//         List<List<Integer>>res=rootToLeafPath(root);
        
//         int count=0;
        
//         for(List<Integer>item:res){
            
//             HashMap<Integer,Integer>hm=new HashMap<>();
            
//             for(int ele:item){
//                 hm.put(ele,hm.getOrDefault(ele,0)+1);
//             }
            
//             int flag=0;
//             if(item.size()%2==0){
                
//                 flag=0;
//                 for(int key:hm.keySet()){
//                     if(hm.get(key)%2!=0){
//                         flag=1;
//                         break;
//                     }
//                 }
                
//                 if(flag==0){
//                     count++;
//                 }
//             }
            
//             else{
                
//                 flag=0;
//                 int oc=0;
//                 for(int key:hm.keySet()){
//                     if(hm.get(key)%2!=0){
//                         oc++;
//                     }
//                     if(oc>1){
//                         break;
//                     }
//                 }
                
//                 if(oc==1){
//                     count++;
//                 }
//             }
//         }
        
//         return count;
    }
    
//     public List<List<Integer>> rootToLeafPath(TreeNode node){
        
//         if(node==null){
//             return new ArrayList<>();
//         }
        
//         List<List<Integer>>myres=new ArrayList<>();
            
//         if(node.left==null && node.right==null){
//             myres.add(new ArrayList<>());
//             myres.get(0).add(node.val);
//             return myres;
//         }
        
//         List<List<Integer>>lres=rootToLeafPath(node.left);
        
//         if(lres.size()>0){
//             for(List<Integer>item:lres){
//                 item.add(node.val);
//             }
//         }
        
//         List<List<Integer>>rres=rootToLeafPath(node.right);
        
//         if(rres.size()>0){
//             for(List<Integer>item:rres){
//                 item.add(node.val);
//             }
//         }
        
//         myres.addAll(lres);
//         myres.addAll(rres);
        
//         return myres;
//     }
    
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