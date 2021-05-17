import java.util.*;
class height
{
    
    static public class Node
    {
        Node left;
        Node right;
        int data;
    }
    
    public int maxDepth(Node node) 
    {
        if(node==null)
            return 0;
        
        int lr=maxDepth(node.left);  //making call to the left part
        int rr=maxDepth(node.right);  //making call to the right part
        int height=Math.max(lr,rr);  //then finding maximum of the two part
        
        height+=1;   //then adding itself to the height calculated
        
        return height; //and returning to the calling node above it
        
    }
}