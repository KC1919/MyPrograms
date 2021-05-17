//Q) Maximum subarray sum.

import java.util.*;
class max_sum
{
    static Scanner sc=new Scanner(System.in);
    
    /*static int max(int a[])   //brute force approach O(N^2) 
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<a.length;i++)
        {
            sum=0;
            for(int j=i;j<a.length;j++)
            {
                sum+=a[j];
                max=Math.max(sum,max);
            }
        }
        return max;
    }*/
    
    static int maxSum(int a[])    //optimal approach using Kadane's algorithm O(N)
    {
        int sum=0;
        int max=a[0];         //[-2, -3, 4, -1, -2, 1, 5, -3]
        
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];  //adding the elements
            if(sum>max) //if the sum gets greater than the max sum, then we update the max
            max=sum;
            
            if(sum<0) //if at some point the sum becomes negative, means there might be some negative elements present, 
            sum=0;    //so we initialize the sum to 0, because we dont want to take the negative sum forward, as it will only 
        }             //decrease the sum value of the further elements, as its negative. So that is why we initialized it to 0.
        return max;
    }
    
    public static void main(String args[])
    {
        System.out.println("Enter size of the array: ");
        int n=sc.nextInt();
        System.out.println("enter elements: ");
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        //int m=max(a);
        int maxi=maxSum(a);
        
        //System.out.println("maximum subarray sum: "+m);
        System.out.println("maximum subarray sum: "+maxi);
        
    }
}