//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each 
//of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.You may assume the two numbers do 
//not contain any leading zero, except the number 0 itself.

import java.util.*; 
class addTwo
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
    
    static Node addTwoNumbers(Node l1, Node l2) 
    {
         Node head = new Node(0,null);
         Node nh = head;
         int carry = 0;
        
        while(l1!=null || l2!=null || carry!=0) //we run the loop till,any of these conditions are true
        {
            
            int sum = 0;
            
            if(l1!=null)  //we check if the list l1 is not yet null
            {
                sum+=l1.data;  //we add its data to the sum
                l1 = l1.next;  //and move the pointer to the next node of list l1
            }
            
            if(l2!=null)  //we do the same for the list l2 also
            {
                sum+=l2.data; //add its data to the sum, so we not get the sum of the two nodes
                l2 = l2.next; //move the pointer to the next node of list l2
            }
            
            sum+=carry;  //now if there is any previous carry generated, we add it to the sum
            
            int value = sum%10; //now we extract the remainder part
            carry = sum/10;   //and extract the carry part
            
            Node tempNode = new Node(value,null); //make a new node and put the remainder part in that node
            head.next = tempNode;  //link the node to the head of the new list that we created
            head = head.next;       //and move the head to the new node.
        }
       
        return nh.next;  
    }
}