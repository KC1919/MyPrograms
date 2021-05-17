//Q) Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length 
//of the longest path between any two nodes in a tree. This path may or may not pass through the root. 
 
import java.util.*;
class diameter
{
    class Node
    {
        Node left;
        Node right;
        int data;
    }
    
    static int max=-1;
    
    static int dia(Node node)
    {
        if(node==null)
        return -1;
        
        int dch=-1;
        int sdch=-1;
        
        int lres=dia(node.left); //we make a call to left child
        
        if(lres>dch) //we check if the returned height from the left part is greater than the deepest child node(or deepest node)
        {
            sdch=dch; //we update the 2nd deepest node with the deepest node
            dch=lres; //and update the deepest node with current deepest node
        }
        else if(lres>sdch)//if the returned height is less than deepst node, but greater than 2nd deepest node,
        {
            sdch=lres;//so we update the 2nd deepest node,with the returned result
        }
        
        int rres=dia(node.right); //now similarly we make call to the right child, to get its height
        
        if(rres>dch)  //now we do the same comparison
        {
            sdch=dch;
            dch=rres;
        }
        else if(rres>sdch)
        {
            sdch=rres;
        }
        
        
        if((sdch+dch+2)>max) //and finally we add the height of the deepest and the 2nd deepest nodes, and add 2 to get the full length(the joining edge)
        {                    //that join the left and the right child(that is why we are adding 2)
            max=sdch+dch+2; //now if this sum of heights is greater than the maximum diameter, we update the diameter
        }
        dch+=1;   //we return the diameter to the above calling node, by adding the height of itself
        return dch;
    }
}