// { Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    
    public static Node start;
    public static int minTime(Node root, int target) 
    {
        HashMap<Node,Node>hm=new HashMap<>();
        
        HashMap<Node,Boolean>visited=new HashMap<>();
        
        collectParents(root,null,hm,visited);
        start=null;
        find(root,target);
        
        Queue<Node>que=new LinkedList<>();
        
        que.add(start);
        
        int time=0;
        
        while(que.size()>0)
        {
            int size=que.size();
            int flag=0;
            
            while(size-->0)
            {
                Node rem=que.remove();
                
                visited.put(rem,true);
                
                if(rem.left!=null && visited.get(rem.left)!=true)
                {
                    que.add(rem.left);
                    visited.put(rem.left,true);
                    flag=1;
                }
                
                if(rem.right!=null && visited.get(rem.right)!=true)
                {
                    que.add(rem.right);
                    visited.put(rem.right,true);
                    flag=1;
                }
                
                if(hm.containsKey(rem))
                {
                    Node parent=hm.get(rem);
                    if(visited.get(parent)!=true)
                    {
                        que.add(parent);
                        visited.put(parent,true);
                        flag=1;
                    }
                }
            }
            if(flag==1)
            time+=1;
        }
        
        return time;
    
    }
    
    public static void find(Node node, int target)
    {
        if(node==null)
        return;
        
        if(node.data==target)
        {
            start=node;
            return;
        }
        
        find(node.left,target);
        find(node.right,target);
        
        return;
    }
    public static void collectParents(Node node, Node parent, HashMap<Node,Node>hm,HashMap<Node,Boolean>visited)
    {
        if(node==null)
            return;
            
        visited.put(node,false);
        
        if(parent!=null)
        {
            hm.put(node,parent);
        }
        
        collectParents(node.left,node,hm,visited);
        collectParents(node.right,node,hm,visited);
    }   
}