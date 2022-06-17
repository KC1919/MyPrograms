// { Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int n, int a[], int sum){
        
        
        boolean dp[][]=new boolean[n][sum+1];
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=sum;j++){
                
                if(j==0){
                    dp[i][j]=true;
                    continue;
                }
                
                else if(j==a[i]){
                    dp[i][j]=true;
                }
                
                else if(j<a[i]){
                    if(i>0){
                        dp[i][j]=dp[i-1][j];
                    }
                }
                
                else if(a[i]<j){
                    
                    if(i>0 && dp[i-1][j-a[i]]==true){
                        dp[i][j]=true;
                    }
                    
                    else if(i>0){
                        dp[i][j]=dp[i-1][j];
                    }
                }
                
                if(j==sum && dp[i][j]==true)
                return true;
            }
        }
        return false;
    }
}