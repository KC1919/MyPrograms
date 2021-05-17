//Q) Check the if the list is palindrome or not.

import java.util.*;
class palin
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
    
    public boolean isPalindrome(Node head) 
    {
        Node n1=head; //we take two pointers to the head of the list
        Node n2=head;
        
        while(n2!=null&&n2.next!=null) //now we apply the concept of slow and fast pointer
        {
            n1=n1.next;             //moves by 1
            n2=n2.next.next;        //moves by 2
        }                           //so when the fast pointer reaches to null,  the slow pointer is standing at the mid of the list
        
        Node rh=reverse(n1,null); //now we reverse the second half of the list
        n1=head;          //and reset the pointer to head of the list
        while(rh!=null) //now we traverse till the head of the reverse list is not null
        {
            if(n1.data!=rh.data) //we keep comparing the data of the first half and the second reversed half
            {
                return false; //if at some point it mismatches, we return false
            }
            n1=n1.next; //otherwise we keep moving
            rh=rh.next;
        }
        return true; //and if succesfull traversed without returning false,means the list is palindrome, so we return true
        
    }
    
    public Node reverse(Node l1,Node l2) //function to reverse the list
    {
        Node prev=l2,curr=l1,next=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
}