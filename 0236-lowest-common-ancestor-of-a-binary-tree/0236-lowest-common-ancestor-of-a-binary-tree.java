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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode>l1=new ArrayList<>();
        List<TreeNode>l2=new ArrayList<>();

        LCA(root,l1,p);
        LCA(root,l2,q);

        int i=l1.size()-1;
        int j=l2.size()-1;

        while(i>=0 && j>=0){
            if(l1.get(i)!=l2.get(j)){
                break;
            }

            i--;
            j--;
        }

        return l1.get(i+1);
    }

    private boolean LCA(TreeNode node, List<TreeNode>list, TreeNode target){
        if(node==null) return false;

        if(node==target){
            list.add(node);
            return true;
        }

        boolean lres=LCA(node.left,list,target);

        if(lres==true){
            list.add(node);
            return true;
        }

        boolean rres=LCA(node.right,list,target);

        if(rres==true){
            list.add(node);
            return true;
        }

        return false;
    }
}