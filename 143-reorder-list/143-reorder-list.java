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
        
        if(head==null || head.next==null){
            return;
        }
        
        ListNode slow=head, fast=head, prev=null;;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=null;
        ListNode rhead=reverse(slow);
        
        slow=head;
        
        while(slow!=null && rhead!=null){
            
            ListNode lnext=slow.next;
            ListNode rnext=rhead.next;
            
            slow.next=rhead;
            slow=lnext;
            
            if(slow==null){
                break;
            }
            
            rhead.next=slow;
            rhead=rnext;
        }
    }
    
    private ListNode reverse(ListNode node){
        
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