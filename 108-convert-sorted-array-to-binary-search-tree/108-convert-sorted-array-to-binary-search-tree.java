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
    public TreeNode sortedArrayToBST(int[] a) {
        return partiBST(a,0,a.length-1);
    }
    
    private TreeNode partiBST(int a[], int l, int r){
        
        if(l>r){
            return null;
        }
        
        int mid=(l+r)/2;
        
        TreeNode node=new TreeNode(a[mid]);
        
        TreeNode leftChild=partiBST(a,l,mid-1);
        TreeNode rightChild=partiBST(a,mid+1,r);
        
        node.left=leftChild;
        node.right=rightChild;
        
        return node;
    }
}