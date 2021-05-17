import java.util.*;
class revGrpK
{
    static Scanner sc=new Scanner(System.in);
    static Node head;
    public static class Node
    {
        Node next;
        int data;
    }

    static  void insert(int d)
    {
        Node node=new Node();
        node.data=d;

        if(head==null)
            head=node;

        else
        {
            Node n=head;

            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    
    
    static int length(Node node)
    {
        int len=0;
        while(node!=null)
        {
            node=node.next;
            ++len;
        }
        return len;
    }
    
    static Node th=null;
    static Node tt=null;
    
    static void addFirst(Node node)  //this function, adds node to the front of the list
    {
        if(th==null)   //we check if the th(temp. head) is null, means the node is the first in its group
        {  
            th=node;   //so we assign the (th) to that node
            tt=node;   //tt(temp. tail) to that node
        }
        else           //if its not the first node
        {
            node.next=th; //we attach the node to the front of the list
            th=node;      //and move the temp head to the new head of the list, i.e the current node added
        }
        
    }
    
    static Node revInGrpK(Node node,int k)
    {
        int len=length(node);               //we find the length of the linked list
        if(k>len)
        return null;
        
        Node curr=node,next=null;       //we take some local variables,
        
        Node oh=null,ot=null;           //oh: "original head" , ot: "original tail"
        
        while(len>=k)               //we run the loop till, the reversal group size is less than or equal to the length of the list
        {
            int t=k;                //we take temporary variable, to store the group size(k)
            
            while(t-- >0)          //we run the loop till t becomes 0, and this loop reverses the nodes in group of K.
            {
                next=curr.next;    //we store the address next node of the current node
                curr.next=null;    //we make the next of current node as null
                addFirst(curr);    //we use our, add first function, to add the current node to the list, we are making
                curr=next;         //and lastly move the current pointer to the next node, whose address we stored initially
            }
            
            if(oh==null)  //now we check if oh9original head)is null, means no reversed grop has been attached to the new list
            {
                oh=th;   //so we move the oh to th
                ot=tt;   //and ot to tt
            }
            else       //if this is not the 1st group to be attached to the list,in making
            {
                ot.next=th;  //we attach the new group to the list
                ot=tt;       //and move the ot to tt
            }
            
            th=null;        //we make the th=null and tt=null, so as to make new reversed group
            tt=null;
            len=len-k;      //and we keep on decrementing the length by k, in each iteration of the outer while loop
                    
        }
        ot.next=curr;    
        
        return oh; //and finally we return the head of the new list, made by attaching the reversed groups of k and making the list
    }
        
        
    static void show(Node node)
    {

        while(node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();

    }

    public static void main(String args[])
    {
        System.out.println("enter no. of nodes: ");
        int n=sc.nextInt();
        
        System.out.println("enter node values: ");
        
        for(int i=0;i<n;i++)
        {
            insert(sc.nextInt());
        }
        
        System.out.println("enter group size: ");
        int k=sc.nextInt();
        
        show(head);
        Node oh=revInGrpK(head,k);
        show(oh);
    }
}

            