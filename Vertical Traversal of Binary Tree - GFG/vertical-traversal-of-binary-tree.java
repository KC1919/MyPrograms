// { Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
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

class GfG {
    
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
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution obj = new Solution();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	        
	        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    static class Pair
    {
        Node node;
        int level;
        
        Pair(Node node, int level){
            this.node=node;
            this.level=level;
        }
    }
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        int w[]=new int[2];
        width(root,0,w);
        
        int wid=(w[1]-w[0])+1;
        
        List<List<Integer>>list=new ArrayList<>();
        
        for(int i=0;i<wid;i++){
            list.add(new ArrayList<>());
        }
        
        Queue<Pair>que=new LinkedList<>();
        
        que.add(new Pair(root,Math.abs(w[0])));
        
        while(que.size()>0){
            
            int size=que.size();
            
            while(size-->0){
                
                Pair rem=que.remove();
                
                // if(list.get(p.rem).size()==0){
                    list.get(rem.level).add(rem.node.data);
                // }
                
                if(rem.node.left!=null){
                    que.add(new Pair(rem.node.left,rem.level-1));
                }
                
                if(rem.node.right!=null){
                    que.add(new Pair(rem.node.right,rem.level+1));
                }
            }
        }
        
        ArrayList<Integer>res=new ArrayList<>();
        
        for(List<Integer>l:list){
            for(int ele:l){
                res.add(ele);
            }
        }
        
        return res;
    }
    
    private static void width(Node node, int level, int wid[]){
        if(node==null){
            return;
        }
        
        wid[0]=Math.min(wid[0],level);
        wid[1]=Math.max(wid[1],level);
        
        width(node.left,level-1,wid);
        width(node.right,level+1,wid);
    }
}