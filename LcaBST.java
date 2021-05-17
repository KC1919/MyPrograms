import java.util.*;
class LcaBST
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
        find(root,p,p1);
        find(root,q,p2);
        int i=p1.size()-1;
        int j=p2.size()-1;
        
        while(i>=0&&j>=0 && p1.get(i)==p2.get(j))
        {
            i--;
            j--;
        }
        return p1.get(i+1);
    }
    
    public boolean find(Node node,Node target,ArrayList<Node>list)
    {
        if(node==null)
            return false;
        
        if(node.data==target.data)
        {
            list.add(node);
            return true;
        }
        
        if(target.data<node.data)
        {
            boolean lr=find(node.left,target,list);
            if(lr==true)
            {
                list.add(node);
                return true;
            }
        }
        else
        {
            boolean rr=find(node.right,target,list);
            if(rr==true)
            {
                list.add(node);
                return true;
            }
        }
        return false;
           
    }
}