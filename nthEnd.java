 
//Q) Given the head of a linked list, remove the nth node from the end of the list and return its head. 
 
import java.util.*;
class nthEnd
{
    static class Node
    {
        Node next;
        int data;
        
        Node(int data,Node next)
        {
            this.data=data;
            this.next=next;
        }
    }
    public Node removeNthFromEnd(Node head, int n) 
    {
        if(head==null)
            return null;
        
        
        Node n1=head,n2=head;
        
        while(n>0)
        {
            n2=n2.next; //we first move one pointer n steps forward,so that when we start another pointer from the head
            n--;         
        }
        
        if(n2==null)
            return head.next;
        
        while(n2.next!=null) //like this, we now move the two pointer simultaneously, so when the next of the pointer at n, will be null,
        {
            n2=n2.next; 
            n1=n1.next;     //then the pointer which started from the head, would be just 1 node behind the (nth) node from end,
        }
        
        n1.next=n1.next.next; //now as we have to delete the nth node from the end, so we will break the link to that node, and make a new link to 
                              //the node just next to the nth node from the end
        return head;   //and finally return the head of this modified linked list
        
    }
}