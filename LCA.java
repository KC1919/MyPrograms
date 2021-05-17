//Q)Lowest common ancestor.

import java.util.*;
class LCA 
{
    public class Node
    {
        Node left;
        Node right;
        int data;
    }
    public Node lowestCommonAncestor(Node root, Node p, Node q) 
    {
        ArrayList<Node>p1=new ArrayList<>();
        ArrayList<Node>p2=new ArrayList<>();
        getpath(root,p,p1);
        getpath(root,q,p2);
        
        int i=p1.size()-1;
        int j=p2.size()-1;
        
        while(i>=0 && j>=0 && p1.get(i)==p2.get(j))
        {
            i--;
            j--;
        }
        
        return p1.get(i+1);
    }
    
    
    boolean getpath(Node node,Node target,ArrayList<Node> list)
    {
        if(node==null)
            return false;
        
        if(node==target)
        {
            list.add(node);
            return true;
        }
        
        boolean lc=getpath(node.left,target,list);
        if(lc==true)
        {
            list.add(node);
            return true;
        }
        boolean rc=getpath(node.right,target,list);
        if(rc==true)
        {
            list.add(node);
            return true;
        }
        
        return false;
            
    }
}