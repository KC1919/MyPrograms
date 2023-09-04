/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head==null) return false;
        
        ListNode n=head;
        ListNode n1=n.next;  

        while(n!=null && (n1!=null && n1.next!=null)){

            if(n==n1) return true;

            n=n.next;
            n1=n1.next.next;
        }

        return false;
    }
}