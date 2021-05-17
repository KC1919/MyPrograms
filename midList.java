//Q) Find the middle of the list. 
 
import java.util.*;
class midList
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
    public Node middleNode(Node head) 
    {
        Node n=head,n1=head;
        
        while(n1!=null&&n1.next!=null)
        {
            n=n.next;
            n1=n1.next.next;
        }
        
        return n;
    }
}