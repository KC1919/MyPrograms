// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} // } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        if()
        int n=a.length;
        
        int dp[]=new int[n];
        
        dp[0]=a[0];
        
        int len=1;
        
        for(int i=1;i<n;i++){
            
            int pos=findPos(dp,len-1,a[i]);
                dp[pos]=a[i];
                
            if(pos==len)
                len++;
        }
        return len;
    }
    
    private static int findPos(int a[], int high, int target){
        
        int l=0, h=high;
        int mid=-1;
        
        while(l<=h){
            mid=(l+h)/2;
            
            if(a[mid]<target)
                l=mid+1;
                
            else if(a[mid]>target)
                h=mid-1;
                
            else
                return mid;
        }
        
        return l;
    }
} 