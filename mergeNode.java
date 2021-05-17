import java.util.*;
class mergeNode
{
    static Scanner sc=new Scanner(System.in);
    
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
    
    static Node mergeTwoNodes(Node l1, Node l2) //we are given head nodes of two list l1 and l2
    {
        if(l1==null&&l2==null)
            return null;
        
        else if(l1==null)
            return l2;
        
        else if(l2==null)
            return l1;
        
        
        Node n1=l1;     //now we initialize them in temporary node pointer
        Node n2=l2;
        Node node=new Node(0,null);  //we make a new list node
        Node head=node;           //we assign a head to the new list
        Node hl=node;
        
        
        while(n1!=null && n2!=null)   //now we traverse both the list, as soon as one of the list finishes, means reaches null, we stop
        {
            if(n1.data==n2.data)    //now we start merging, we check if the data in both nodes of the list is same
            {
                Node k1=new Node(n1.data,null);  //we create two new node, and assign them the data 
                Node k2=new Node(n2.data,null);
                k1.next=k2;     //we attach the two nodes created
                head.next=k1;  //attaching the new node chain to the head of the new list
                head=k2;      //move the head to the tail of new list
                n1=n1.next;   //move the pointer of the passed lists
                n2=n2.next;
            }
            
            else if(n1.data<n2.data)    //if the data of (l1) is smaller than the data of list (l2)
            {
                Node nn=new Node(n1.data,null);  //we make anew node, assign the data
                head.next=nn;                    //attach to the new list
                head=head.next;                  //move the head to the tail of the list
                n1=n1.next;                      //move the pointer of l1
            }
            
            else if(n1.data>n2.data)     //if the data of (l2) is smaller than the data of list (l1)
            {
                Node nn=new Node(n2.data,null); //we make anew node, assign the data
                head.next=nn;                   //attach to the new list
                head=head.next;                 //move the head to the tail of the list
                n2=n2.next;                     //move the pointer of l1
            }
        }
        
        while(n1!=null)    //now this loop we run, to ensure if there is any node left in list (l1), so we add them to the new list
        {
            Node nn=new Node(n1.data,null);
            head.next=nn;
            head=head.next;
            n1=n1.next; 
        }
        while(n2!=null)   //now this loop we run, to ensure if there is any node left in list (l2), so we add them to the new list
        {
            Node nn=new Node(n2.data,null);
            head.next=nn;
            head=head.next;
            n2=n2.next;
        }
        
        return hl.next; //we finally return the head node of the newly created list, that we formed by merging the nodes of the two passed list
    }                   //i.e l1 and l2 in sorted order.
}