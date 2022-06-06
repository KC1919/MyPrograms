/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) 
    {
        ListNode n1=l1;
        ListNode n2=l2;
        
        if(n1==null ||n2==null)
            return null;
        
        while(n1!=n2)
        {
            n1=(n1==null)?l2:n1.next;
            n2=(n2==null)?l1:n2.next;
        }
        
        return n1;
        
    }
}