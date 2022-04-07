// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int a[], int n, int m) {
        
        int max=0, count=0, zc=0, j=0;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            count++;
            
            else if(a[i]==0)
            {
                zc++;
                count++;
                
                while(j<=i && zc>m)
                {
                    if(a[j]==0)
                    zc--;
                    
                    count--;
                    j++;
                }
            }
            
            max=Math.max(count,max);
        }
        
        return max;
    }
}