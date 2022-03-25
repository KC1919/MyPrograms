// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String s){
        
        
        int left=0, right=0, max=0;
        int li=-1, ri=-1;
        
        for(int i=0;i<s.length();i++)
        {
            left=i;
            right=i;
            
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    if((right-left+1)>max){
                        li=left;
                        ri=right;
                        max=right-left+1;
                    }
                    left--;
                    right++;
                }
            }
            
            left=i;
            right=i+1;
            
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    if((right-left+1)>max){
                        li=left;
                        ri=right;
                        max=right-left+1;
                    }
                    left--;
                    right++;
                }
            }
        }
        
        if(li==-1 || ri==-1)return "";
        
        return s.substring(li,ri+1);
    }
}