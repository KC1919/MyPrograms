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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return null;
        
        
        ListNode n1=head,n2=head;
        
        while(n>0)
        {
            n2=n2.next;
            n--;
        }
        
        if(n2==null)
            return head.next;
        
        while(n2.next!=null)
        {
            n2=n2.next;
            n1=n1.next;
        }
        
        n1.next=n1.next.next;
        
        return head;
    }
}