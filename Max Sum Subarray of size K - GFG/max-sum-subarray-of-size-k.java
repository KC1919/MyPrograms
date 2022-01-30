// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int maximumSumSubarray(int k, ArrayList<Integer> list, int n)
    {
        int sum=0;
        
        for(int i=0;i<k;i++)
        sum+=list.get(i);
        
        int j=0, ni=k;
        
        int max=sum;
        
        while(ni<n)
        {
            sum=sum-list.get(j);
            sum+=list.get(ni);
            ni++;
            j++;
            
            max=Math.max(max,sum);
        }
        
        return max;
    }
    
}