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
        
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow=head, fast=head.next;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        
//         HashSet<ListNode>hm=new HashSet<>();
        
//         ListNode node=head;
        
//         while(node!=null){
            
//             if(hm.contains(node)){
//                 return true;
//             }
//             hm.add(node);
//             node=node.next;
//         }
        return false;
    }
}