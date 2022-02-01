// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String N = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMax(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String findMax(String s) 
    {
        char a[]=s.toCharArray();
        
        Arrays.sort(a);
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<a.length;i++)
        {
            sb.insert(0,a[i]);
        }
        
        return sb.toString();
        
    }
};