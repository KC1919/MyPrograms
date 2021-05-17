//Q) Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

import java.util.*;
class sum_0
{
    static Scanner sc=new Scanner(System.in);
    
    static int maxLen(int a[])   //TC = O(n) , SC = O(n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        int max=-1;
        int sum=0;
        int len=0;
        
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];  //we keep adding the elements, in the sum
            
            if(sum==0)   //if the sum becomes zero, then
            {
                max=Math.max(i,max)+1;  //we store the position where the sum became zero
                
            }
            
            else   //else, we check if the sum is present in the hashmap or not
            {
                if(!hm.containsKey(sum)) //if not present ,we add the sum up to the ith element in the hashmap,with index upto which the sum is
                {
                    hm.put(sum,i);
                }
            
                else      //but if the sum is already present in the hashmap, that means in between there had been elements which summed to 0,
                {
                    len=i-hm.get(sum);  //so we calculate the span of those lements by, fetching the index, where we previously atored that sum
                    max=Math.max(max,len); //and the subtract it by the current index, where the sum became equal to that sum
                }                          //this is how we'll get the length of the suarray with 0 sum, and we compare the length of the array
            }                         //if its greater than the length stored in max, we update the max with current calculated length
            
            
        }
        if(max>0)
        return max;
        
        return 0;
        
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        int res=maxLen(a);
        System.out.println("Maximum length subarray with 0 sum is: "+res);
    }
}
        