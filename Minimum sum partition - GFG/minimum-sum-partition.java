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
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int a[], int n) 
	{ 
	    
	    if(n==1){
	        return a[0];
	    }
	    
	    int tsum=0;
	    
	    for(int ele:a){
	        tsum+=ele;
	    }
	    
	    //we make a dp table, with elements VS target sum
        boolean dp[][]=new boolean[n][tsum+1];
        
        //we take an element one by one
        for(int i=0;i<n;i++){
            
            //we go from sum 1 till target
            for(int j=1;j<=tsum;j++)
            {
                
                //we check if the current element is greater than the current
                //target sum
                if(j<a[i]){
                    
                    //so it check whether if the previous elements were able to make
                    // this target sum, if yes then this target sum could be
                    //made
                    if(i>0 && dp[i-1][j]==true)
                        dp[i][j]=true;
                    
                    //else we put false, becoz the previous were not able to make
                    //and the current element is also greater than the current
                    // target sum, so it can also not make
                    else
                        dp[i][j]=false;
                }
                
                
                else{
                    
                    //if the current target sum is equal to the current element, 
                    // then this target can be made, so we put true
                    if(j==a[i]){
                        dp[i][j]=true;
                    }
                    
                    //else if the target sum is greater than the current element
                    //then we check can the sum of (target-currEle) can be made
                    //by the previous elements, because if that can be made, the
                    //the current element will be able to make the remaining
                    else if(j>a[i]){
                        
                        //if yes then we put true
                        if(i>0 && dp[i-1][j-a[i]]==true){
                            dp[i][j]=true;
                        }
                        
                        else if(i>0 && dp[i-1][j]==true)
                        dp[i][j]=true;
                    }
                }
            }
        }
        
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<=tsum/2;i++){
            
            if(dp[n-1][i]==true){
                int s1=i;
                int s2=tsum-s1;
                min=Math.min(min,Math.abs(s1-s2));
            }
        }
        return min;
	} 

}
