//Q) Merge K sorted lists

import java.util.*;
class mergeK 
{
    class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public Node mergeKLists(Node[] lists) 
    {
        if(lists.length==0)
        return null;
        
        PriorityQueue<Node>pq=new PriorityQueue<>((a,b)->{
            return a.data-b.data;
            });
            
        Node dummy=new Node(-1);
        Node prev=dummy;
        
        
        for(Node list : lists)      //looping through the lists array, 
        {
            if(list!=null)          //and adding head node of each list, in the priority queue if its not null
            pq.add(list);
        }
        
        while(pq.size()!=0)         //we loop till,priority queue is not empty
        {
            Node node=pq.remove();  //we remove a node, which is having minimum value of all the nodes inside PQ
            prev.next=node;         //we add this node to our dummy list,
            prev=prev.next;         //we move the prev pointer to the current node added
            node=node.next;         //and we move to the node next to the removed node
            
            if(node!=null)          //we check if the node is not null
            pq.add(node);           //we add the node to the PQ, else not
        }
        
        return dummy.next;          //and when the while loop is over, we our having our sorted merged list, and we return the head of the formed list
        
    }
}