//Q) Rotate the list by k steps.

import java.util.*;
class rotatList
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
    
    public Node rotateRight(Node head, int k) 
    {
        if(head==null||k==0)
            return head;
        
        Node n1=head;
        Node n2=head;
        
        int count=0;
        while(n1!=null)
        {
            n1=n1.next;
            ++count;
        }
        
        if(count==1 || count==k)
            return head;
        
        if(k>count)    //if the rotation is greater than the length of the list, then we do modulo to bring it within the range of the list length
        {
            k=k%count;
        }
        
        if(k==0)     //if rotation is =0 then simply return the head without rotating the list
        {
            return head;
        }
        
        n1.next=head;   //else, connect the last node to the 1st node of the list
        int i=0;
        
        while(i<(count-k))   //traverse from the last node, till the node, till where you have to rotate
        {
            n1=n1.next;      //so we travel, and when we reach
            i++;
        }
        
        head=n1.next;           //we assign the head to that node
        n1.next=null;           //and break the link from the previous node
        
        return head;            //and return the head of the rotated list
        
    }
}