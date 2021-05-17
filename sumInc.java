//Q) Maximum Sum increasing Subsequence

import java.util.*;
class sumInc
{
    static class lenSum
    {
        int maxlen=0;
        int maxsum=0;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter no. of elements: ");
        int n=sc.nextInt();
        
        
        int a[]=new int[n];
        
        lenSum dp[]=new lenSum[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            dp[i]=new lenSum();
        }
        
        
        
        int msum=0;
        
        for(int i=0;i<a.length;i++)
        {
            int max=0;                         //{1, 101, 2, 3, 100} 
            int sum=0;
            
            for(int j=0;j<i;j++)
            {
                if(a[i]>a[j])
                {
                    max=Math.max(max,dp[j].maxlen);
                    sum=Math.max(sum,dp[j].maxsum);
                }
            }
            max+=1;
            sum+=a[i];
            dp[i].maxlen=max;
            dp[i].maxsum=sum;
            msum=Math.max(msum,dp[i].maxsum);
        }
        System.out.println("Maximum incresing sum: "+msum);
    }
    
}
            