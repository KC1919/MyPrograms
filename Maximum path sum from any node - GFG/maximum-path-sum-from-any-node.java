// { Driver Code Starts
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
    static void printInorder(Node root){
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t-- > 0){
	            String s= br.readLine();
	            Node root = buildTree(s);
	            
	            Solution tr=new Solution();
	            int sum=tr.findMaxSum(root);
	            System.out.println(sum);
	        }
	}
}// } Driver Code Ends


/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution
{
    int maxSum=-10001;
    //Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node root)
    {
        if(root==null)
            return 0;
        
        maxSum=-10001;
        
        getMaxPathSum(root);
        return maxSum;
    }
    
    public int getMaxPathSum(Node node){
        
        if(node==null)
            return 0;
        
        int lres=getMaxPathSum(node.left);
        int rres=getMaxPathSum(node.right);
        
        //maximum between the left result and right result
        int max=Math.max(lres,rres);
        int myPathSum=node.data;
        
        //if the maximum is not negative
        if(max>=0){
            
            //if both lres and rres are positive then we add both to the myPathSum
            if(lres>=0 && rres>=0)
                myPathSum+=lres+rres;
            
            //else if any one is negative
            //we add the positive one
            else
                myPathSum+=max;
        }
            
        //we compare the maximum sum so far and compare it with our current
        //pathSum and update accordingly
        maxSum=Math.max(maxSum,myPathSum);
        
        //and we return to the above node, the path that will lead to the
        //maximum sum
        
        //so we check if the max of the left and right result is positive
        //then we add ourself(current node's value to the max) and return
        //else if the max is negative so we only return the current node's value
        //because adding negative would minimize the path sum
        return max>=0?max+node.data:node.data;
    }
}
