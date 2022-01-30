// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long a[], int n, int K)
    {
        int ni=-1;
        
        long ans[]=new long[n-K+1];
        int k=0;
        
        for(int i=0;i<K;i++)
        {
            if(a[i]<0)
            {
                ni=i;
                ans[k++]=a[i];
                break;
            }
        }
        
        if(k==0)
        k++;
        
        int si=1, ei=K;
        
        while(ei<n)
        {
            if(si<=ni && ni<=ei)
            {
                ans[k++]=a[ni];
            }
            else
            {
                int flag=0;
                inner:for(int i=si;i<=ei;i++)
                {
                    if(a[i]<0)
                    {
                        ni=i;
                        flag=1;
                        break inner;
                    }
                }
                if(flag==1)
                {
                    ans[k++]=a[ni];
                }
                else
                k++;
            }
            si++;
            ei++;
        }
        
        return ans;
    }
}