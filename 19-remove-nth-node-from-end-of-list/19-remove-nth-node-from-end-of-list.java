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
        
        if(head==null || n==0){
            return head;
        }
        
        int k=n;
        ListNode n1=head;
        ListNode n2=head;
        
        while(k-->0){
            n2=n2.next;
        }
        
        if(n2==null){
            return n1.next;
        }
        
        while(n2.next!=null){
            n2=n2.next;
            n1=n1.next;
        }
        
        n1.next=n1.next.next;
        
        return head;
    }
}