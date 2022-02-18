// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long heights[], long n) 
    {
        long ls[]=new long[heights.length];
        
        ls[0]=-1;
        
        int len=(int)n;
        
        for(int i=1;i<len;i++)
        {
            int j=i-1;
            while(j>=0 && heights[j]>=heights[i])
            {
                j=(int)ls[j];
            }
            if(j==-1)
            {
                ls[i]=-1;
            }
            else
            {
                ls[i]=j;
            }
        }
        long rs[]=new long[heights.length];
        rs[len-1]=len;
        
        for(int i=len-2;i>=0;i--)
        {
            int j=i+1;
            while(j<len && heights[j]>=heights[i])
            {
                j=(int)rs[j];
            }
            if(j==len)
            {
                rs[i]=len;
            }
            else
            {
                rs[i]=j;
            }
        }
        
        long max=0;
        for(int i=0;i<len;i++)
        {
            long area=(rs[i]-ls[i]-1)*heights[i];
            max=Math.max(max,area);
        }
        return max;
    }
        
}



