// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) 
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        int max=0;
        int j=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            if(hm.size()==k)
                max=Math.max(i-j+1,max);
            
            while(j<i && hm.size()>k)
            {
                char rem=s.charAt(j);
                
                hm.put(rem,hm.get(rem)-1);
                
                if(hm.get(rem)==0)
                    hm.remove(rem);
                
                j++;
            }
        }
        
        return max==0?-1:max;
    }
}