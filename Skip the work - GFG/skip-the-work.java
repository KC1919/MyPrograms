// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minAmount(A,n));
                }
        }
}    // } Driver Code Ends



class Solution
{
  public int minAmount(int a[] , int n)
    {
        if(n==1){
            return 0;
        }
        
        int incl=a[0];
        int excl=0;
        
        int min=0;
        
        for(int i=1;i<n;i++){
            
            int nincl=excl+a[i];
            
            int nexcl=Math.min(incl,excl+a[i]);
            
            min=Math.min(nexcl,nincl);
            
            incl=nincl;
            excl=nexcl;
        }
        
        return min;
    }
}