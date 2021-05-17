import java.util.*;
class abc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        long orderValue=sc.nextLong();
        
        System.out.println(discountAMT(orderValue));
        
        
    }
    
    public static int discountAMT(long orderValue)
    {
        int answer=0;
        while(orderValue>0)
        {
            long a=orderValue%10;
            orderValue=orderValue/10;
            if(isPrime(a))
            {
                answer+=a;
            }
            
        }
        return (answer);
    }
        
    public static boolean isPrime(long n)
    {
        int f=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f==2)
        return true;
        
        return false;
    }
    
    public static int[] maxRevenue(int[][] salesRecord)
    {
        if(salesRecord.length==0)
            return new int[0];
        
        int answer[]=new int[salesRecord.length];
        int max=0,c=0;
        
        for(int i=0;i<salesRecord.length;i++)
        {
            int j=0;
            while(j<salesRecord[0].length)
            {
                max=Math.max(salesRecord[i][j],max);
                j++;
            }
            answer[c++]=max;
            max=0;
        }
        
        return answer;
    }

}



        
        
        
        
        
        
        