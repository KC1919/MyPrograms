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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head.next==null){
            return null;
        }
        
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        
        ListNode n=head;
        ListNode nn=head;
        
        while(nn!=null && nn.next!=null){
            nn=nn.next.next;
            n=n.next;
        }

        n.val=n.next.val;
        n.next=n.next.next;
        
        return head;
    }
}