//You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. 
//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//Initially, all next pointers are set to NULL.

import java.util.*;
class popNext 
{
    public class Node
    {
        Node left;
        Node right;
        Node next;
        int data;
    }
    
    public Node connect(Node root) 
    {
        if(root==null)
            return root;
        Queue<Node>que=new LinkedList<>();
        
        que.add(root);
        
        while(que.size()!=0)
        {
            int size=que.size();
            
            for(;size>0;size--) //this loop helps store the elements level order wise
            {
                Node rem=que.remove(); //we remove each node,
                if(size>1)    //check if there are nodes on its right, by checking the size of the queue
                {
                    rem.next=que.peek(); //if yes, then we attach the next pointer of the node, to its horizontally right node
                }
        
                if(rem.left!=null)  //and finally we add the child nodes of the current node
                    que.add(rem.left);
                if(rem.right!=null)
                    que.add(rem.right);
                
            }
            
        }
        return root; //we return the root of the modified tree
        
    }
}