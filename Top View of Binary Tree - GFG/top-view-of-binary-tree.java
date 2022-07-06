// { Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Tree {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
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
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution ob = new Solution();

                ArrayList<Integer> vec = ob.topView(root);
                for(int x : vec)
                    System.out.print(x + " ");
                System.out.println();
        	
                t--;   
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    static class Pair
    {
        int level;
        Node node;
        
        Pair(Node node, int level){
            this.node=node;
            this.level=level;
        }
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root){
        
        int wid[]=new int[2];
        
        getWidth(root,0,wid);
        
        int width=wid[1]-wid[0]+1;
        
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=0;i<width;i++){
            list.add(-1);
        }
        
        Queue<Pair>que=new LinkedList<>();
        
        que.add(new Pair(root,Math.abs(wid[0])));
        
        while(que.size()>0){
            int size=que.size();
            
            while(size-->0){
                
                Pair rem=que.remove();
                
                if(list.get(rem.level)==-1){
                    list.set(rem.level,rem.node.data);
                }
                
                if(rem.node.left!=null){
                    que.add(new Pair(rem.node.left,rem.level-1));
                }
                
                if(rem.node.right!=null){
                    que.add(new Pair(rem.node.right,rem.level+1));
                }
            }
        }
        return list;
    }
    
    private static void getWidth(Node node, int level, int wid[]){
        
        if(node==null){
            return;
        }
        
        wid[0]=Math.min(wid[0],level);
        wid[1]=Math.max(wid[1],level);
        
        getWidth(node.left,level-1,wid);
        getWidth(node.right,level+1,wid);
    }
}