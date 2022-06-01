// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    class Pair
    {
        int idx;
        int val;
        
        Pair(int val, int idx)
        {
            this.val=val;
            this.idx=idx;
        }
    }
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int n=nums.length;
        Pair a[]=new Pair[n];
        
        for(int i=0;i<n;i++){
            a[i]=new Pair(nums[i],i);
        }
        
        Arrays.sort(a,(b,c)->{
            return b.val-c.val;
            });
        
        boolean vis[]=new boolean[n];
        
        int swaps=0;
        
        for(int i=0;i<n;i++){
            
            if(vis[i]==true || i==a[i].idx){
                continue;
            }
            
            int j=i;
            int clen=0;
            
            while(j<n){
                if(vis[j]==true){
                    break;
                }
                
                clen++;
                vis[j]=true;
                j=a[j].idx;
            }
            swaps+=(clen-1);
        }
        return swaps;
    }
}