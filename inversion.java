//Q) Count the number of inversion pair in the given array.

import java.util.*;
class inversion
{
    static Scanner sc=new Scanner(System.in);
    
    static int invPair(int a[])
    {
        String pair="";
        int count=0;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[i])
                {
                    pair+="(" + a[i]+ "," + a[j]+ ") ,";
                    ++count;
                }
            }
        }
        System.out.println(pair.substring(0,pair.length()-1));
        
        return count;
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        int res=invPair(a);
        System.out.println("count of inversions is: "+res);
    }
}
        
                