import java.util.*; 
class Tree
{
    static public class Node
    {
        Node left;
        Node right;
        int data;
    }
    
    boolean isBalanced(Node node)
    {
        if (node == null) 
        return true; 
  
        
        int lh = height(node.left); 
        int rh = height(node.right); 
  
        boolean lr=isBalanced(node.left);
        boolean rr=isBalanced(node.right);
        
        if(Math.abs(lh-rh)<=1 && lr==true && rr==true)
        return true;
        
        return false;

    }
    
    int height(Node node)
    {
        if(node==null)
        return 0;
        
        int lh=height(node.left);
        int rh=height(node.right);
        int height=Math.max(lh,rh)+1;
        
        return height;
    }
}
    