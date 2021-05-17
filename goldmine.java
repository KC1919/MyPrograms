import java.util.*;
class goldmine
{   
    
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and col: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int gold[][]=new int[n][m];//stores the gold in each cell
        int dp[][]=new int[n][m]; 
        
        System.out.println("Enter gold in each cell: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                gold[i][j]=sc.nextInt();
            }
        }
        
        for(int j=m-1;j>=0;j--) //keeping the column fixed,
        {
            for(int i=n-1;i>=0;i--)  //we are moving vertically,from bottom to top,from the last column
            {
                if(j==m-1) //we see ,if we are at the last column, then we simply put the gold as it is,because we can't dig further in any direction
                {          //from there
                    dp[i][j]=gold[i][j]; //so we simply put the gold in there
                }
                else if(i==n-1) //we see if we are in the last row of the matrix
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i-1][j+1]); //then we can go in right direction or diagonally upward direction
                }                                          //so we compare the values of both the direction,whichever is higher, we take that value
                else if(i==0) //if we are at in the first row of the matrix, we can go in right forward dir. and and diagonally downwards
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1]); //so again we take the greater value among them
                }
                
                else  //if we are elsewhere, we have 3 direction to choose,i.e diagonally upwards,diagonally downwards and right forward
                {
                    dp[i][j]=Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1])); //so we again take the greatest value among them
                }
            }
        }
                       //so now we are having the maximum gold in the 1st cell of each row
        int maxgold=-1;
        for(int i=0;i<n;i++)  //so we take a loop
        {
            maxgold=Math.max(dp[i][0],maxgold); //and traverse the 1st cell of each row, and which ever has the max gold,
        }
        System.out.println(maxgold); //we print it
        
    }
}
