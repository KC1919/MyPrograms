
//Q) Write a program to find the node at which the intersection of two singly linked lists begins. 
 
import java.util.*;
class interPoint
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
    
    public Node getIntersectionNode(Node l1, Node l2) 
    {
        Node n1=l1; //we take two head pointers to the 2 given list
        Node n2=l2;
        
        if(n1==null ||n2==null)
            return null;
        
        while(n1!=n2)  //now we iterate till the two nodes are equal
        {
            n1=(n1==null)?l2:n1.next;  //if n1 becomes null, we move it to the head of l2, else we keep moving one step forward  Line*
            n2=(n2==null)?l1:n2.next;  //if n2 becomes null, we move it to the head of l1, else we keep moving one step forward  Line**
        }
        
        return n1;
        
    }
}

/*
 * Line && **Line => We are swapping the pointer to another lists head, because, if one of the list is smaller, so one of the pointer will reach null 
 * early. And at this point the other pointer would be still moving, so we move the pointer which reaches the null early to the head of longer list
 * Because, when the pointer which reached early to null, we assign that to longer list head, and the other pointer which has not reached null,
 * would move some steps to reach null, so when that will move some steps to move to null, then at the same time , the pointer we assigned to the longer
 * list's head would also move those number of steps, so when the pointer will reach null, we will assign it to the head of other list, which is shorter,
 * now the pointer would be standing at the same position in both list, and will move parallely,and as soon as they become equal ,we will get 
 * the intersection point.
 */