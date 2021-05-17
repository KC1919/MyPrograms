
//Q) Set matrix zeroes. If a zero is found ,then set the entire row and column 
//zero, in which the zero was found.
//constraint: -2^31 <= matrix[i][j] <= 2^31 - 1

import java.util.*;
class set_zero
{
    static Scanner sc=new Scanner(System.in);
    
    static void setZero(int a[][])    //brute force approach
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
               if(a[i][j]==0)  //if 0 is found
               {
                   for(int k=0;k<a[0].length;k++)  //then turning all the elments of that row except 0 to (Integer.MAX_VALUE+2)
                   {
                       if(a[i][k]!=0)
                       a[i][k]=Integer.MAX_VALUE+2;  //due to the constraint we added +2
                   }
                   
                   for(int m=0;m<a.length;m++)  //then turning all the elments of that column except 0 to (Integer.MAX_VALUE+2)
                   {
                       if(a[m][j]!=0)
                       a[m][j]=Integer.MAX_VALUE+2;
                   }
               }
            }
        }
        
        for(int i=0;i<a.length;i++)    //again traversing the matrix
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==Integer.MAX_VALUE+2)  //if max+2 is value is found at any cell, we change its value to 0.
                a[i][j]=0;
            }
        }
        
    }
    
    static void set(int a[][])  //this is a better approach than previous one,becoz in this we are not making every row and col 0 while traversing,
    {                           //instead we took 2 arrays one to store the index of row and another to store the index of column
        
        boolean r[]=new boolean[a.length];
        boolean c[]=new boolean[a[0].length];
        
        for(int i=0;i<a.length;i++)  
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==0)   //if we encounter 0 while traversing
                {
                    r[i]=true;   //we mark "true" in row array at ith index
                    c[j]=true;   //we mark "true" in col array at jth index
                }                //we did this, so that we know which row and col to fill with 0's.
                
            }
        }
        
        for(int i=0;i<a.length;i++)    //now we traverse the matrix again
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(r[i]==true || c[j]==true)   //and check the ith and jth index in (row) and (col) arrays, if we find "true" at those index
                {
                    a[i][j]=0;          //then we chnge the value at a[i][j]  to 0.
                }
                    
            }
        }
        
    }
    
    
    
    public static void main(String args[])
    {
        System.out.println("enter row and col of the matrix: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Integer.MIN_VALUE);
        int a[][]=new int[r][c];
       
        System.out.println("enter matrix elements: ");
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        //setZero(a); bruteforce function
        
        set(a); //optimal function
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
            