// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

class Chainlength
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Pair pr[] = new Pair[n];
            int arr[] = new int[2*n];
            for(int i = 0; i < 2*n; i++)
            {
               arr[i] = sc.nextInt();
            }
            for(int i = 0, j = 0; i < 2*n-1 && j < n; i = i+2, j++)
            {
                pr[j] = new Pair(arr[i], arr[i+1]);
            }
            GfG g = new GfG();
            System.out.println(g.maxChainLength(pr, n));
        }
    }
}
// } Driver Code Ends


/*class CompareByFirst implements Comparator<Pair>
{
   public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}*/

class GfG
{
    int maxChainLength(Pair a[], int n)
    {
        Arrays.sort(a,(b,c)->{
            return b.y-c.y;
        });
        
        int dp[]=new int[n];
        
        dp[0]=1;
        
        int omax=1;
        
        for(int i=1;i<n;i++){
            int max=0;
            
            for(int j=0;j<i;j++){
                if(a[j].y<a[i].x){
                    max=Math.max(dp[j],max);
                }
            }
            
            dp[i]=max+1;
            omax=Math.max(dp[i],omax);
        }
        
        return omax;
    }
}