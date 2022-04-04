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
    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
    
    public TreeNode construct(int a[], int l, int h)
    {
        if(l>h)
            return null;
        
        int mid=(l+h)/2;
        
        TreeNode lc=construct(a,l,mid-1);
        TreeNode rc=construct(a,mid+1,h);
        
        TreeNode node=new TreeNode(a[mid],lc,rc);
        return node;
    }
}