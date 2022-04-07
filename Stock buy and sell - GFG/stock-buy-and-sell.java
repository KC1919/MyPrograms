// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(inputLine[i]);
            }
            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);
                
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<ans.size(); i++)
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                
                if(c==p)
                    System.out.print(1);
                else
                    System.out.print(0);
            }System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int a[], int n) {
        
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        int start=0, end=-1;
        
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            end=i;
            
            else if(a[i]<a[i-1])
            {
                if(end!=-1){
                    ArrayList<Integer>list=new ArrayList<>();
                    list.add(start);
                    list.add(end);
                    ans.add(list);
                }
                end=-1;
                start=i;
            }
        }
        
        if(end!=-1)
        {
            ArrayList<Integer>list=new ArrayList<>();
            list.add(start);
            list.add(end);
            ans.add(list);
        }
        return ans;
    }
}
