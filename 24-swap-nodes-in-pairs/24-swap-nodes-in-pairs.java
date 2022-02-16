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
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null)
            return head;
        
        ListNode n=head;
        
        ListNode curr=n, prev=null;
        List<ListNode>address=new ArrayList<>();
        
        while(curr!=null)
        {
            curr=reverse(curr,null,2,address);
        }
        
        for(int i=0;i<address.size()-1;i++)
        {
            ListNode add=address.get(i);
            
            if(add!=null && add.next!=null)
            {
                ListNode temp=address.get(i+1);
                add.next.next=temp;
            }
        }
        return address.get(0);
    }
    
    public ListNode reverse(ListNode curr, ListNode prev, int k, List<ListNode>address)
    {
        ListNode next=null;
        
        while(k-->0 && curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        address.add(prev);
        return curr;
    }
}