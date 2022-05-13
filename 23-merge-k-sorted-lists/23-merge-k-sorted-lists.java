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
        
        //adding the head node of each list in the queue
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)
                pq.add(lists[i]);
        }
        
        //dummy list
        ListNode dummy=new ListNode();
        
        //pointer to the head of the dummy list
        ListNode temp=dummy;
        
        while(pq.size()>0){
            
            //take out the smallest node from the queue
            ListNode rem=pq.remove();
            
            //link thsi node to the dummy list
            temp.next=rem;
            
            //move the dummy list pointer
            temp=temp.next;
            
            //move to the next node of the removed node
            rem=rem.next;
            
            //ifthe next node is not null, we add it to the priority queue
            if(rem!=null)
                pq.add(rem);
            
        }
        
        //fnally return the head node of the dummy list formed after merging
        //k lists
        return dummy.next;
    }
}