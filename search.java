//Q) Search the given element in 2-D matrix.

import java.util.*;
class search
{
    static Scanner sc=new Scanner(System.in);
    
    static boolean searchMatrix(int[][] a, int target) 
    {
        
        int f=0;
        for(int i=0;i<a.length;i++)    //for loop to visit each row
        {
            int col=a[0].length-1;     //initializing col with the last column, since the matrix is sorted row and col wise, so if the element
                                       //to be searched is greater than the last element of a row, it means we dont have to search in that row
                                       
            if(a[i][col]<target)       //so if the element
                continue;             //to be searched is greater than the last element of a row, it means we don't have to search in that row
                                      //so we increment the row(continue)
            else                    //but if the target element is less than the last element of the ith row, the it means it must be present in that 
            {
                f=1;                    //row only and not other rows
                while(col>=0)       //so we start searching for it in that row, we check each cell of that row backwards(from the end)
                {
                    if(a[i][col]==target)  //if the target is found, we update the status variable to true.
                    {
                        return true;
                    }
                    col--;       //decrementing the column, so that we can check each cell of the row
                }
            }
            if(f==1)
                break;
        }
        return false;
    }
    
    static boolean search(int a[][], int target)
    {
        //another approach is to do binary search in the suspected row, to reduce the time complexity
        
        int j=a[0].length-1;           //everything is same as that of the above approach, just instead of searching linearly,here we applied 
        for(int i=0;i<a.length;i++)    //binary search
        {
            if(target>a[i][j])
            {
                continue;
            }
            
            else if(target<a[i][j])
            {
                if(binary(a,i,0,j,target))
                {
                    return true;
                }
            }
            else
            {
                return true;
            }
        }
        
        return false;
    }
    
    static boolean binary(int a[][],int i,int l, int h,int target) //function for binary seacrh
    {
        while(l<h)
        {
            int mid=(l+h)/2;
            
            if(target>a[i][mid])
            {
                l=mid+1;
            }
            else if(target<a[i][mid])
            {
                h=mid;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        System.out.println("enter row and col of the matrix: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
       
        System.out.println("enter matrix elements: ");
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("enter element to be searched: ");
        int target=sc.nextInt();
        
        boolean res=searchMatrix(a,target);
        boolean res2=search(a,target);
        System.out.println("Present: "+res);
        System.out.println("Present: "+res2);
    }
}