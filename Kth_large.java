import java.util.*;
class Kth_large
{
    class Node
    {
        Node left;
        Node right;
        int data;
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K) //recursive inorder traversal approach
    {
        ArrayList<Integer>list=new ArrayList<>();
        travel(root,list);
        int i=list.size()-1;
        
        return list.get(i-K+1);
    }
    
    static void travel(Node node,ArrayList<Integer> list)
    {
        if(node==null)
        return;
        
        travel(node.left,list);
        list.add(node.data);
        travel(node.right,list);
    }
    
    public static int kth_Large(Node node,int k) //iterative inorder traversal approach(better,as it saves space and time)
    {
        LinkedList<Node> list=new LinkedList<Node>();
        
        while(true)
        {
            while(node!=null)
            {
                list.add(node);
                node=node.right;
            }
            
            node=list.removeLast();
            if(--k==0)
            return node.data;
            
            node=node.left;
        }
    }
}