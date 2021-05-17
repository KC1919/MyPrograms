import java.io.*;
import java.util.*;

public class nQueens 
{
    public static void main(String[] args) throws Exception 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of queens: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        
        printNQueens(a,"",0);
        
    }

    public static void printNQueens(int[][] chess, String ans, int row) 
    {
        if(row==chess.length)   //if we reach out of the board, means we have successfully placed all the N queens on the board
        {
            System.out.println(ans+".");  //so we print the answer
            return;                       //and return from the call
        }
        
        for(int j=0;j<chess.length;j++)   //we explore all the possible cells of a particular row
        {
            if(isSafe(chess,row,j)==true)   //if we are able to safely place a Queen in a row
            {
                chess[row][j]=1;       //we mark the cell as placed,where the queen has been placed
                printNQueens(chess,ans+row+"-"+j+", ",row+1);  //and we move to the next row
                chess[row][j]=0;       //while returning from the row, we remove tha placed queen, so we can explore other ways of placing safely all
            }                          //the queens
        }
        
    }
    
    static boolean isSafe(int chess[][],int row,int col)
    {
        for(int i=row-1,j=col;i>=0;i--)   //checking if there is any queen present above in that column
        {
            if(chess[i][j]==1)   //if already present, then we cant place another, so we return false
            {
                return false;
            }
        }
        
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)   //check in the left diagonal, if there is any queen already present
        {
            if(chess[i][j]==1)  //then we return false, means another queen cannot be placed
            {
                return false;
            }
        }
        
        for(int i=row-1,j=col+1;i>=0 && j<chess[0].length;i--,j++)  //checking same condition in the right diagonal
        {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        return true; //if none of the above conditions are met, means the queen is safe to place, then we return true.
    }
}