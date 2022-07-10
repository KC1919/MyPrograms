// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String s){
        
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); //pushing the index of the opening bracket
            } else { //if closing bracket
                stack.pop(); //we pop the peek index
                if (stack.empty()) {  //if the stack gets empty
                    stack.push(i);    //we push the closing bracket's index
                } else { //else we calculate the length, y taking the difference of the 
                        //curent closing bracket index and the index of the opening 
                        //bracket at the peek of the stack
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
}