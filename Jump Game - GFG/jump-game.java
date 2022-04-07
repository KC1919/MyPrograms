// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.canReach(A,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int canReach(int[] a, int n) 
    {
        if(n==1)
        return 1;
        
        for(int i=n-2;i>=0;i--)
        {
            int dest=i;
            for(int jump=1;jump<=a[i];jump++)
            {
                dest+=jump;
                
                if(dest==n-1 || dest>=n)
                {
                    a[i]=-1;
                    break;
                }
                else if(dest<n && a[dest]==0)
                {
                    dest=i;
                    continue;
                }
                else if(dest<n && a[dest]==-1){
                    a[i]=-1;
                    break;
                }
            }
        }
        
        if(a[0]==-1)
        return 1;
        
        return 0;
    }
};