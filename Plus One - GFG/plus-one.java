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
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> list , int n) 
    {
        int carry=0, rem=0, sum=0, cand=0;
        int i=n-1;
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        while(i>=0 || carry!=0)
        {
            if(i>=0)
            {
                cand=list.get(i);
                if(i==n-1)
                    cand+=1;
                    
                i--;
            }
            
            sum=cand;
            
            if(carry!=0)
            {
                sum+=carry;
                carry=0;
            }
            
            rem=sum%10;
            carry=sum/10;
            
            ans.add(rem);
            sum=0;
            cand=0;
        }
        
        Collections.reverse(ans);
        return ans;
    }
};