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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->{
            return a.val-b.val;
        });
        
        for(int i=0;i<lists.length;i++){
            
            if(lists[i]!=null)
                pq.add(lists[i]);
        }
        
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        
        while(pq.size()>0){
            ListNode rem=pq.remove();
            
            temp.next=rem;
            temp=temp.next;
            
            rem=rem.next;
            
            if(rem!=null)
                pq.add(rem);
            
        }
        return dummy.next;
    }
}