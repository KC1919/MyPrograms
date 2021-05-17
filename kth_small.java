import java.util.*;
class kth_small 
{
    class Node
    {
        Node left;
        Node right;
        int data;
    }
    public int kthSmallest(Node node, int k) //reursive inorder traversal approach, TC=O(n), SC=O(N)
    {
        ArrayList<Integer>list=new ArrayList<>();
        travel(node,list);
        return list.get(k-1);
        
    }
    
    public void travel(Node node,ArrayList<Integer> list)
    {
        if(node==null)
            return;
        
        travel(node.left,list);
        list.add(node.data);
        travel(node.right,list);
    }
    
    public int kthSmall(Node node, int k) //iterative inorder traversal approach, saves space and time
    {
        LinkedList<Node> list = new LinkedList<Node>();
        
       while(true) 
       {
           while (node != null) 
           {
               list.add(node);
               node = node.left;
           }
           
           node = list.removeLast();
           
           if (--k == 0) 
           return node.data;
           
           node = node.right;
       }
    }
}