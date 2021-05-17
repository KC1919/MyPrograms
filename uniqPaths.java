 //Q) A robot is located at the top-left corner of a m x n maze.The robot can only move either down or right at any point in time.
//The robot is trying to reach the bottom-right corner of the maze.How many possible unique paths are there? 
 
 
import java.util.*; 
class uniqPaths 
{
    static Scanner sc=new Scanner(System.in);
    
    static int count=0;
    static void paths(int i,int j,int m,int n) //brute-force approach
    {
        if(i>=m || j>=n)    //we are checking , the robot should not cross the boundary of the maze
            return;         //if it happens, we return 
            
        if(i==m-1 && j==n-1)  //if the robot reaches the destination cell, i.e is the bottom right corner cell. we increase the (count) by 1
            count++;           //count is the total number of paths available to reach the destination
            
        paths(i+1,j,m,n);   //this call moves the robot to 1 step down
        paths(i,j+1,m,n);   //and this call moves the rebot to 1 step right
        
        
    }
    
    static public int uniquePaths(int i , int j , int m , int n , int dp[][]) //dynamic programming approach (better)
    {
        
        if(i>=m || j>=n)    //we are checking , the robot should not cross the boundary of the maze
            return 0;       //as it has an integer return type, so we need to return (0), in such a case
        
        if(i==m-1 && j==n-1)   //else if the robot reaches the destination
        {
            return 1;       //we return (1) in that case
        }
        
        if(dp[i][j]!=-1)      //we check if the result from this path is available or not, if the path has already been visited earlier, means the result
            return dp[i][j];  //must be stored , so if thats the case, we directly return the result,to the calling part, instead of making further call
                              //again, that has been previously made by other cells, we utilize the result returned by other cells,who visited the path
        
        int res=0;            //we take a result variable
        int dr=uniquePaths(i+1,j,m,n,dp);  //we call the result from the downwards move,to see if there exists a path if we move downwards
        int rr=uniquePaths(i,j+1,m,n,dp);  //we call the result from the right move,to see if there exists a path we move rightwards
        res=dr+rr;                  //then we add the result returned by both the moves, if both returned 1, means 2 path exists from the current cell
        
        dp[i][j]=res;    //and store the returned result,in the matrix, so that it can be reused by other calls, instead of again making unecessary calls
        
        return res;      //we return the result to the calling part;
        
    }
    
    static public int uniqPath(int m, int n)   // combination approach(Maths)  nCr  (optimal)
    {
        int N=n+m-2;
        int r=n-1;
        double res=1.0;
        
        for(int i=1;i<=r;i++)
        {
            res=res*(N-r+i)/i;
        }
        
        return (int)res;
        
    }
    
    
    public static void main(String args[])
    {
        System.out.println("enter row and col: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int dp[][]=new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
        }
        
        System.out.println(uniquePaths(0,0,m,n,dp));
        System.out.println(uniqPath(m,n));
        paths(0,0,m,n);
        System.out.println(count);
    }
}