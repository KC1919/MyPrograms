// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int target = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.threeSumClosest(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int threeSumClosest(int[] a, int target)  
	{ 
        Arrays.sort(a);
        
        int max=Integer.MIN_VALUE, close=Integer.MAX_VALUE;
        
        for(int i=0;i<a.length-2;i++)
        {
            if(i>0 && a[i]==a[i-1])
            continue;
            
            int comp=target-a[i];
            
            if(comp>=0)
            {
                int res=twoSum(a,i+1,a.length-1,comp);
                int fres=res+a[i];
                
                // System.out.println(fres);
                
                if(fres==target)return fres;
                
                else
                {
                    if(Math.abs(target-fres)<close)
                    {
    	                close=Math.abs(target-fres);
    	                max=fres;
	                }
	           
    	            else if(close==Math.abs(target-fres) && fres>max)
    	            max=fres;
                }
                
            }
        }
        return max;
	}
	
	public static int twoSum(int a[], int start, int end, int target)
	{
	    int diff=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    
	    while(start<end)
	    {
	        int sum=a[start]+a[end];
	        
	        if(sum==target)
	            return sum;
	        
	        if(Math.abs(target-sum)<=diff)
	        {
	            if(Math.abs(target-sum)<diff){
	                diff=Math.abs(target-sum);
	                max=sum;
	            }
	           
	            else if(diff==Math.abs(target-sum) && sum>max)
	            max=sum;
	        }
	        
	        if(sum<target)
	        start++;
	        
	        
	        else if(sum>target)
	        end--;
	    }
	    return max;
	}
} 
