//Q) Rotate matrix or rotate image.

import java.util.*;
class rotate
{
    static Scanner sc=new Scanner(System.in);
    
    static void rotate(int a[][])
    {
        for(int i=0;i<a[0].length;i++)   //first we reverse all the columns of the matrix
        {
            int start=0;
            int end=a.length-1;
            
            while(start<end)     //reversing the columns
            {
                int p=a[start][i];
                a[start][i]=a[end][i];
                a[end][i]=p;
                start++;
                end--;
            }
        }
        /*                               //then we reverse all the left diagonals of the matrix.
        for(int i=0;i<a.length;i++)    //this loop is for reversing the first half of the left diagonals of the matrix, from start
        {
            int c=0;                //we started from the first column
            int r=i;                //and the ith row
            while(c<r)              //we reverse till column is less than row
            {
                int p=a[r][c];     //we start swapping(reversing) the elements at the left diagonal
                a[r][c]=a[c][r];   
                a[c][r]=p;
                
                c++;          //incrementing the column becoz at left diagonal, the column increases, as we go from left to right
                r--;          //and decrementing the row becoz, row decreases, as we have to get the elements in between of the diagonal
                
            }
        }
        
        for(int i=a.length-1;i>0;i--)     //this loop reverses the 2nd half of the left diagonals of the matrix ,from the end
        {
            int c=a.length-1;   //we assign column with last column
            int r=i;            //and row with the ith row
            while(c>r)          //we reverse till col is greater than row
            {
                int p=a[r][c];
                a[r][c]=a[c][r];
                a[c][r]=p;
                
                c--;      //int this we are decrementing column becoz, we are traversing from the end, so we have to go from right to left
                r++;      //and incrementing the row, becoz ,we have to reverse the middle elemnts of the diagonal also,
                          //previously we started from the 1st row, so we decremented the row, in this case, we started from the last row, 
                          //so we are incrementing in this case
                
            }
        }*/
        
        //This code is replacement of the above commented code, This code transposes the given matrix
        
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i; j < a.length; j++) 
            {
                int tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }
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
        
        rotate(a);
        
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
        