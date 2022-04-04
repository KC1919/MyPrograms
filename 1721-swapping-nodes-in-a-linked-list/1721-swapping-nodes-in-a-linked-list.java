/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode fast=head, slow=head, left=head;
        
        int c=k;
        while(c-->1)
        {
            fast=fast.next;
            left=left.next;
        }
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        int temp=slow.val;
        slow.val=left.val;
        left.val=temp;
        
        return head;
    }
}