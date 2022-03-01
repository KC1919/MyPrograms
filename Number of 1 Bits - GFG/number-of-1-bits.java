// { Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int n) {
    //   int dp[]=new int[n+1];
        
        // dp[0]=0;
        
        // for(int i=1;i<=n;i++){
            return binary(n);
        // }
        // return dp[n];
    }
    
    public static int binary(int n)
    {
        int rem=0, num=n, count=0;
        
        while(num>0)
        {
            rem=num%2;
            if(rem==1)
                count++;
            
            num=num/2;
        }
        // dp[n]=count;
        return count;
    }
}