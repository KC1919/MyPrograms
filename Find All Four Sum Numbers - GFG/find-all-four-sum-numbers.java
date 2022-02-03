// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int target) 
    {
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        
        int n=a.length;
        
        for(int i=0;i<n;i++)
        {
            if(i!=0 && a[i]==a[i-1]) continue;
            
            for(int j=i+1;j<n;j++)
            {
                if(j!=i+1 && a[j]==a[j-1]) continue;
                
                int si=j+1, ei=n-1;
                
                while(si<ei)
                {
                    int sum=a[i]+a[j]+a[si]+a[ei];
                    
                    if(sum>target) ei--;
                    else if(sum<target) si++;
                    else
                    {
                        res.add(new ArrayList(Arrays.asList(a[i],a[j],a[si],a[ei])));
                        si++;
                        ei--;
                        
                        while(si<ei && a[si]==a[si-1])si++;
                        while(si<ei && a[ei]==a[ei+1])ei--;
                    }
                }
            }
        }
        
        return res;
        
    }
}