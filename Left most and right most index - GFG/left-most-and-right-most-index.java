// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    // class pair
    // {
    //     int li;
    //     int ri;
    // }
    
    public pair indexes(long a[], long target)
    {
        int l=0, h=a.length-1;
        
        int mid=-1;
        
        long li=leftMost(a,target);
        
        if(li==-1)
        {
            pair p=new pair(-1,-1);
            return p;
        }
        
        long ri=rightMost(a,target);
        
        pair p1=new pair(li,ri);
        return p1;
        
    }
    
    public static long leftMost(long a[], long target)
    {
        long l=0, h=a.length-1;
        
        long mid=-1;
        
        long li=-1;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            
            if(a[(int)mid]<target)
            l=mid+1;
            
            else if(a[(int)mid]>target)
            h=mid-1;
            
            else
            {
                li=mid;
                if(mid>0 && a[(int)mid-1]!=a[(int)mid]){
                    li=mid;
                    break;
                }
                else
                {
                    h=mid-1;
                }
            }
        }
        return li;
    }
    
    public static long rightMost(long a[], long target)
    {
        long l=0, h=a.length-1;
        
        long mid=-1;
        
        long ri=-1;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            
            if(a[(int)mid]<target)
            l=mid+1;
            
            else if(a[(int)mid]>target)
            h=mid-1;
            
            else
            {
                ri=mid;
                if(mid<a.length-1 && a[(int)mid+1]!=a[(int)mid]){
                    ri=mid;
                    break;
                }
                else
                {
                    l=mid+1;
                }
            }
        }
        return ri;
    }
}