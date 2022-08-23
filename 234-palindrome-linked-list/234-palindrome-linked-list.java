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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null){
            return true;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode rhead=reverse(slow);
        ListNode node=head;
        
        while(rhead!=null && node!=null){
            if(rhead.val!=node.val){
                return false;
            }
            
            rhead=rhead.next;
            node=node.next;
        }
        
        return true;
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