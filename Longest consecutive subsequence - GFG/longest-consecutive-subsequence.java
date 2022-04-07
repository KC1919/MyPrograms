// { Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int a[], int n)
	{
	   HashMap<Integer,Boolean>hm=new HashMap<>();
	   
	   for(int i=0;i<n;i++)
	   {
	      hm.put(a[i],false); 
	   }
	   
	   for(int i=0;i<n;i++)
	   {
	       if(!hm.containsKey(a[i]-1))
	       hm.put(a[i],true);
	   }
	   
	   int max=0;
	   for(int i=0;i<n;i++)
	   {
	       if(hm.get(a[i])==true)
	       {
	           int count=0;
	           while(hm.containsKey(a[i]+count))
	           {
	               count++;
	           }
	           max=Math.max(max,count);
	       }
	   }
	   
	   return max;
	}
}