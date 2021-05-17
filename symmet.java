import java.util.*;
class symmet
{
    class Node
    {
        Node left;
        Node right;
        int data;
    }
    public boolean isSymmetric(Node root) 
    {
        return isMirror(root, root);  //we are passing the root of the tree,2 times, because, from one root, we will go to left side
    }                                 //and from another root we will go to right side,so that we can compare the nodes on both the side of the tree
        
    public boolean isMirror(Node t1, Node t2) //function to check if the tree is mirror image of itsef or not
    {
        if (t1 == null && t2 == null) //if both the nodes are null, we return true
            return true;
        
        if (t1 == null || t2 == null) //else if either of them is null, we return false, because that is not possible in a mirror tree
            return false;             //so we return false
        
        return (t1.data == t2.data)   //else we return by checking for every node
            && isMirror(t1.right, t2.left)
            && isMirror(t1.left, t2.right);
    }
}