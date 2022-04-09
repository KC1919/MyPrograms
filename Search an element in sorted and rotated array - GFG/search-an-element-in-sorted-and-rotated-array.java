// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int a[], int target)
	{
        int l=0, h=a.length-1;
        
        while(l<=h)
        {
            int mid=(l+h)/2;
            
            if(a[mid]==target)
            return mid;
            
            else if(a[l]<=a[mid])
            {
                if(target>=a[l] && target<a[mid])
                h=mid-1;
                
                else
                l=mid+1;
            }
            
            else
            {
                if(target<=a[h] && target>a[mid])
                l=mid+1;
                
                else
                h=mid-1;
            }
        }
        
        return -1;
	}
} 

