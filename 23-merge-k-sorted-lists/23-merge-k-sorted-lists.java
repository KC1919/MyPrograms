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
class Solution 
{
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists.length==0)
            return null;
        
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->{return a.val-b.val;});
        int n=lists.length;
        
        for(int i=0;i<n;i++)
        {
            if(lists[i]!=null)
                pq.add(lists[i]);
        }
            
        
        ListNode demo=new ListNode();
        ListNode temp=demo;
        
        while(pq.size()>0)
        {
            ListNode rem=pq.remove();
            
            if(rem!=null)
            {
                if(rem.next!=null)
                    pq.add(rem.next);
                
                temp.next=rem;
                temp=temp.next;
            }
        }
        return demo.next;
    }
}