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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode start=head, end=head, fhead=null, frhead=null;
        
        while(true){
            
            //if start node or end node reaches null, means the list has been processed
            //so we return the head of the new list formed
            if(start==null || end==null)
                return frhead;
            
            //take a variable c, which holds the group count
            int c=k;
            
            //next variable stores the start node of the next group
            ListNode next=null;
            
            //we find the end node of the current group
            while(c>1 && end.next!=null){
                end=end.next;
                c--;
            }
            
            //if the end node was not reached of a group, that means the remaining nodes
            //could not form a group
            
            if(c>1){
                
                //so we link the head of the remaining node to the last
                //end node of the last group
                fhead.next=start;
                return frhead; ///and return the head of the new list
            }
            
            //get the head of the next group
            next=end.next;
            
            //detach the last node of curretn group from the first node of next group
            end.next=null;
            
            //then reverse the group, from the start node to the end node
            //of the current group
            ListNode rhead=reverse(start,end);
            
            //if it is the first group, so we assign the firstHead(fhead) to the 
            //original head of the list, from where the linking of the next
            //group will start
            if(fhead==null){
                fhead=start;
                frhead=rhead;  //assign the first reverseHead that will be the head
                               //node of the final list that has to be returned
            }
            
            //if it is not the first reversed group 
            else{
                
                //then we link the firstHead node of previous group to the 
                //returned reverseHeadof the current group
                fhead.next=rhead;
                fhead=start;   //and make the start of the current group as the firsthead
            }                  //of the current group that will be used to link to the 
                               //head of the next group
            
            start=next;  //assigning the start to the head node of the next group
            end=next;    //and end also to the head of the next group
        }
    }
    
    //reversing the nodes from start node till end node
    public ListNode reverse(ListNode node, ListNode end){
        
        ListNode curr=node, prev=null, next=null;
        
        while(curr!=end){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        curr.next=prev;
        prev=curr;
        return prev;
    }
}