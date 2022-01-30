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
        
        long ans[]=new long[n-K+1];
        int k=0;
        
        Queue<Long>que=new LinkedList<>();
        
        for(int i=0;i<K;i++)
        {
            if(a[i]<0)
            {
                que.add(a[i]);
                if(k==0)
                    ans[k++]=a[i];
            }
        }
        
        if(k==0)
        k++;
        
        int si=0, ei=K;
        
        while(ei<n)
        {
            if(a[ei]<0)
            que.add(a[ei]);
            
            if(que.size()>0 && que.peek()==a[si])
                que.remove();
                
            if(que.size()>0)
            {
                ans[k++]=que.peek();
            }
            else
            ans[k++]=0;
            
            si++;
            ei++;
        }
        
        return ans;
    }
}