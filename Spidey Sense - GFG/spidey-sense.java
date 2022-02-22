// { Driver Code Starts
import java.util.*;
import java.math.*;

class Pair{
    
    int x,y;
    Pair(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            int m = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());
            char mat[][] = new char[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j] = sc.next().charAt(0);
                }
            }
           
            Solution T = new Solution();
            int ans[][] = T.findDistance(mat, m, n);
            
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    static class Pair
    {
        int row;
        int col;
        int dist;
        
        Pair(int row, int col, int dist)
        {
            this.row=row;
            this.col=col;
            this.dist=dist;
        }
    }
    
    public static int[][] findDistance(char a[][], int n,int m)
    {
        Queue<Pair>que=new LinkedList<>();
        int ans[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]=='B')
                {
                    que.add(new Pair(i,j,0));
                }
                else if(a[i][j]=='W')
                ans[i][j]=-1;
            }
        }
        
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        
        while(que.size()!=0)
        {
            Pair rem=que.remove();
            
            for(int i=0;i<dir.length;i++)
            {
                int row=rem.row+dir[i][0];
                int col=rem.col+dir[i][1];
                
                if(row>=0 && col>=0 && row<n && col<m && a[row][col]=='O')
                {
                    a[row][col]='W';
                    ans[row][col]=rem.dist+1;
                    
                    if(a[rem.row][rem.col]=='B')
                    {
                        ans[rem.row][rem.col]=0;
                    }
                    
                    que.add(new Pair(row,col,rem.dist+1));
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]=='O' && ans[i][j]==0)
                ans[i][j]=-1;
            }
        }
        return ans;
    }
}