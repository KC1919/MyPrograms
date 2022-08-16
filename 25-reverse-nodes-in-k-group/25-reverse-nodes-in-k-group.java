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

    ListNode th=null, tt=null;
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode next=null, node=head;
        ListNode oh=null, ot=null;
        
        int size=length(head);
        
        while(size>=k){
            
            int count=k;
            
            while(count-->0){
                next=node.next;
                node.next=null;
                addFirst(node);
                node=next;
            }
            
            if(oh==null){
                oh=th;
                ot=tt;
            }
            
            else{
                ot.next=th;
                ot=tt;
            }
            
            th=null;
            tt=null;
            size-=k;
        }
        
        
        if(size>0){
            ot.next=node;
        }
        
        return oh;
    }
    
    public void addFirst(ListNode node){
        
        if(th==null){
            th=node;
            tt=node;
        }
        
        else{
            node.next=th;
            th=node;
        }
    }
    
    public int length(ListNode node){
        
        int count=0;
        
        while(node!=null){
            node=node.next;
            count++;
        }
        
        return count;
    }
}