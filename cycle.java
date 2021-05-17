 
//Q) Loop in a linked list.

import java.util.*;
class cycle
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
    
    public boolean hasCycle(Node head) 
    {
        Node n1=head;
        Node n2=head;
        
        while(n1!=null && (n2!=null  &&  n2.next!=null))
        {
            n1=n1.next;
            n2=n2.next.next;
            
            if(n1==n2)
                return true;
        }
              
        return false;
        
    }
}