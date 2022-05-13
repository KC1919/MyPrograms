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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        
        int carry=0;
        int sum=0;
        
        while(l1!=null || l2!=null || carry!=0){
            
            sum=0;
            
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            
            if(carry>0){
                sum+=carry;
                carry=0;
            }
            
            
            int rem=sum%10;
            carry=sum/10;
            
            ListNode nn=new ListNode(rem);
            temp.next=nn;
            temp=temp.next;
        }
        return dummy.next;
    }
}