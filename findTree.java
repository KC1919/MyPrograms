import java.util.*;
class findTree 
{
    public class Node
    {
        Node left;
        Node right;
        int data;
    }
    
    public Node searchBST(Node node, int target) //using reference variable
    {
        Node found[]=new Node[1];
        found[0]=null;
        find(node,target,found);
        return found[0];
        
    }
    
    public Node find(Node node,int target,Node found[])  
    {
        if(node==null)
            return null;
        
        if(node.data==target)
        {
            found[0]=node;
            return node;
        }
            
        else if(target>node.data)
        {
            node.right=find(node.right,target,found);
        }
        
        else if(target<node.data)
        {
            node.left=find(node.left,target,found);
        }
        return node; 
    }
    
    public Node findBST(Node node, int target) //without using reference memory variable
    {
        if(node==null)
            return null;
        
        if(node.data==target) //we only want the root node of the target, so we return only that node
        {
            return node;
        }
            
        else                //else we only make calls,to the left and right nodes
        {
            if(target>node.data)
            {
                return findBST(node.right,target);
            }
            
            return findBST(node.left,target);
            
        }
    }
}