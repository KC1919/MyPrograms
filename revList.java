 
//Q) Reverse the given list. 
 
import java.util.*;
class revList
{
    public static class Node
    {
        Node next;
        int data;
        
        Node(int data,Node next)
        {
            this.data=data;
            this.next=next;
        }
    }
    
    public Node reverseList(Node head) 
    {
        Node prev=null,curr=head,n=null;
        
        while(curr!=null)
        {
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        
        head=prev;
        
        return head;
        
    }
}