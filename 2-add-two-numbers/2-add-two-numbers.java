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
            
            //reset the sum to 0
            sum=0;
            
            //if there is node in the list 1, then we add it
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            
            //if there is node in the list 2, then we add it
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            
            //if there is carry, then we add it tot he sum
            if(carry>0){
                sum+=carry;
                carry=0;   //and reset the carry to 0, after using it
            }
            
            //then we calculate remainder(if the sum is greater than 9, then we will
            //get remainder and carry, if the sum is less than 10, we will get remainder
            //as the sum itself and carry as 0)
            int rem=sum%10;
            carry=sum/10;
            
            //we make a new node, put the calculated value in the node
            ListNode nn=new ListNode(rem);
            temp.next=nn; //append the node in our new list
            temp=temp.next;
        }
        return dummy.next; //finally return the head of the new list, that is formed by
                           //adding the list 1 and list 2
    }
}