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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head==null || head.next==null || left==right){
            return head;
        }
        
        ListNode prev=null;
        
        ListNode node=head;
        
        int count=1;
        
        while(node!=null && count<left){
            prev=node;
            node=node.next;
            count++;
        }
        
        ListNode phead=null;
        
        if(node!=null){
            ListNode rhead[]=reverse(node,right,count);
            
            // System.out.println(rhead[0].val+","+rhead[1].val);
            
            if(prev!=null)
                prev.next=rhead[0];

            phead=rhead[0];
            ListNode tphead=phead;

            while(tphead.next!=null){
                tphead=tphead.next;
            }

            tphead.next=rhead[1];
        }
        return prev!=null?head:phead;
    }
    
    private ListNode[] reverse(ListNode node, int right, int count){
        
        ListNode curr=node, next=null, prev=null;
        
        while(curr!=null && count<=right){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        
        return new ListNode[]{prev,curr};
    }
}