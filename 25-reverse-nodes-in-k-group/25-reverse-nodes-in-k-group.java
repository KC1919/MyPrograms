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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode thead=head;
        
        ListNode start=head, end=head, fhead=null, frhead=null;
        
        while(true){
            
            if(start==null || end==null)
                return frhead;
            
            int c=k;
            ListNode next=null;
            while(c>1 && end.next!=null){
                end=end.next;
                c--;
            }
            
            if(c>1){
                System.out.println(c);
                fhead.next=start;
                return frhead;
            }
            
            next=end.next;
            end.next=null;
            ListNode rhead=reverse(start,end);
            // System.out.println(rhead.val);
            if(fhead==null){
                fhead=start;
                frhead=rhead;
            }
            
            else{
                fhead.next=rhead;
                fhead=start;
            }
            
            start=next;
            end=next;
        }
    }
    
    public ListNode reverse(ListNode node, ListNode end){
        
        ListNode curr=node, prev=null, next=null;
        
        while(curr!=end){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        curr.next=prev;
        prev=curr;
        return prev;
    }
}