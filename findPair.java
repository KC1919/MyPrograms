import java.util.*;
class findPair
{
    class Node
    {
        Node left;
        Node right;
        int data;
    }
    
    public int travel(Node root,Node node, int target) //Time complexity O(nLogn)
    {
        if(node==null)
        {
            return 0;
        }
        
        travel(root,node.left,target);
        int comp=target-node.data;
        if(comp>node.data)
        {
            if(find(root,comp))
                return 1;
        }
        
        travel(root,node.right,target);
        return 0;
        
    }
    
    public boolean find(Node node,int target)
    {
        if(node==null)
        {
            return false;
        }
        
        if(node.data==target)
        {
            return true;
        }
        if(node.data<target)
        {
            boolean lr=find(node.right,target);
            if(lr)
            return true;
        }
        else
        {
            boolean rr=find(node.left,target);
            if(rr)
            return true;
        }
        return false;
    }
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node node, int target) //Time complexity O(N) , Space Complexity O(N)
    {
        ArrayList<Integer>list=new ArrayList<>();
        travel(node,list);
        int i=0,j=list.size()-1;
        
        while(i<j)
        {
            int f=list.get(i);
            int s=list.get(j);
            
            if(f+s>target)
            {
                j--;
            }
            else if(f+s<target)
            {
                i++;
            }
            else
            {
                return 1;
            }
        }
        
        return 0;
    }
    
    static void travel(Node node,ArrayList<Integer>list)
    {
        if(node==null)
        {
            return;
        }
        
        travel(node.left,list);
        list.add(node.data);
        travel(node.right,list);
    }

}
