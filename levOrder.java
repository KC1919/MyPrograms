//Q) Level Order Traversal 

import java.util.*;
class levOrder
{
    public class Node
    {
        Node left;
        Node right;
        int data;
    }
    public List<List<Integer>> levelOrder(Node node) 
    {
        if(node==null)
        {
            List<List<Integer>>l=new ArrayList<>();
            return l;
        }
        
        Queue<Node> que=new LinkedList<>();
        List<List<Integer>>rres=new ArrayList<>();
        que.add(node);
        
        while(que.size()!=0)
        {
            int k=que.size(); //we take the current size of the queue, which is having all elements of the current level
            List<Integer>list=new ArrayList<>();//we make a list
            
            for(int i=0;i<k;i++) //now we iterate thru all those elements of the queue
            {
                
                Node rem=que.remove();//we remove each element,one by one
                list.add(rem.data);  //add the removed element to the list
                if(rem.left!=null)  //we check for its left child
                    que.add(rem.left); //if present, we add it to the queue
                if(rem.right!=null) //we check for the right child
                    que.add(rem.right); //if present we add it to the queue
                
            } //we do this for all the elements which were earlier present in the queue, and not for the elements which are getting added in the queue
            rres.add(list);//we add the list to the final list
        }
        return rres; //and return the list, with all the list, with each list having all elements of a particular level
        
    }
    
    
}