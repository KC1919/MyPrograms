// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
        
//         int count=1;
//         ListNode n=head;

//         while(count<left-1){
//             n=n.next;
//             count++;
//         }

//         ListNode lt=n;
//         n=n.next;
//         ListNode nh=n;
//         count++;
//         lt.next=null;

//         ListNode rres[]=reverse(n,count,right);

//         lt.next=rres[0];
//         nh.next=rres[1];

//         return head;
//     }

//     public ListNode[] reverse(ListNode node, int count, int right){

//         ListNode curr=node, prev=null, next=null;

//         while(count<right){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//             count++;
//         }
//         return new ListNode[]{prev,next};
//     }
// }


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