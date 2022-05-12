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
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null)
            return;
        
        ListNode slow=head, fast=head, prev=null;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode cr=reverse(slow);
        
        // System.out.print(prev.val);
        prev.next=null;
        ListNode cl=head, nl=null, nr=null;
        int turn=0;
        
        while(cl!=null && cr!=null){
            
            if(turn%2==0){
                nl=cl.next;
                cl.next=cr;
                cl=nl;
                turn++;
            }
            
            else{
                nr=cr.next;
                cr.next=cl;
                cr=nr;
                turn++;
            }
        }
    }
    
    public ListNode reverse(ListNode node){
        
        ListNode curr=node, prev=null, next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}