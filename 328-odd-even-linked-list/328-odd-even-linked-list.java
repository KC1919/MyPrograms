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
    public ListNode oddEvenList(ListNode head) 
    {
        if(head==null || head.next==null || head.next.next==null)
            return head;
        
        ListNode curr=head;
        ListNode next=null, prev=null;
        ListNode eh=head.next;
        int count=0;
        
        while(curr.next!=null)
        {
            next=curr.next;
            curr.next=curr.next.next;
            prev=curr;
            curr=next;
            count++;
        }
        
        if(count%2!=0)
            prev.next=eh;
        
        else
            curr.next=eh;
        
        return head;
    }
}