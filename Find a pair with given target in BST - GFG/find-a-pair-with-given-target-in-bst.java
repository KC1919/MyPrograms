// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            int target = Integer.parseInt(br.readLine().trim());
            
            Solution T = new Solution();
            System.out.println(T.isPairPresent(root,target));
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    class Pair
    {
        int state=0;
        Node node;
        
        Pair(Node node, int state)
        {
            this.node=node;
            this.state=state;
        }
    }
    
    public Stack<Pair>st;
    public Stack<Pair>rst;
    
    public int isPairPresent(Node root, int target)
    {
       st=new Stack<>();
       rst=new Stack<>();
       
       st.push(new Pair(root,0));
       rst.push(new Pair(root,0));
       
       Pair left=getNextLeft();
       Pair right=getNextRight();
       
    //   System.out.println(left.data+","+right.data);
       
       while(left.node.data<right.node.data)
       {
           if((left.node.data+right.node.data)==target)
           return 1;
           
           else if((left.node.data+right.node.data)<target)
           {
               left=getNextLeft();
           }
           else if((left.node.data+right.node.data)>target)
           {
               right=getNextRight();
           }
       }
       
       return 0;
        
    }
    
    public Pair getNextLeft()
    {
        while(st.size()>0)
        {
            Pair top=st.peek();
            
            if(top.state==0)
            {
                if(top.node.left!=null)
                {
                    Pair p=new Pair(top.node.left,0);
                    st.push(p);
                }
                top.state++;
            }
            
            else if(top.state==1)
            {
                if(top.node.right!=null)
                {
                    Pair p=new Pair(top.node.right,0);
                    st.push(p);
                }
                top.state++;
                return top;
            }
            
            else
            {
                st.pop();
            }
            
        }
        return null;
    }
    
    public Pair getNextRight()
    {
        while(rst.size()>0)
        {
            Pair top=rst.peek();
            
            if(top.state==0)
            {
                if(top.node.right!=null)
                {
                    Pair p=new Pair(top.node.right,0);
                    rst.push(p);
                }
                top.state++;
            }
            
            else if(top.state==1)
            {
                if(top.node.left!=null)
                {
                    Pair p=new Pair(top.node.left,0);
                    rst.push(p);
                }
                top.state++;
                return top;
            }
            
            else
            {
                rst.pop();
            }
            
        }
        return null;
    }
}
