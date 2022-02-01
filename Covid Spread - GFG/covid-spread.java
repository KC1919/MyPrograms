// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        while(t-- > 0)
        {
            
            
            int R = sc.nextInt();
            
            int C = sc.nextInt();
            
           
            
            int hospital[][] = new int[R][C];
            
            int cnt=0;
            for(int i = 0; i < R; i++)
                {
                    for(int j=0; j < C; j++)
                {
                    hospital[i][j] = sc.nextInt();
                }
                    
                }
            
            Solution ob = new Solution();
            System.out.println(ob.helpaterp(hospital));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public class Pair
    {
        int row;
        int col;
        int time;
        
        Pair(int row, int col, int time)
        {
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    
    public int helpaterp(int[][] a) 
    {
        int n=a.length;
        int m=a[0].length;
        
        Queue<Pair>que=new LinkedList<>(); 
        
        boolean visited[][]=new boolean[n][m];
        
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==2)
                {
                    Pair p=new Pair(i,j,0);
                    que.add(p);
                }
                else if(a[i][j]==1)
                count++;
            }
        }
        
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        
        int time=0;
        while(que.size()>0)
        {
            Pair rem=que.remove();
            
            int r=rem.row;
            int c=rem.col;
            
            for(int i=0;i<dir.length;i++)
            {
                int row=r+dir[i][0];
                int col=c+dir[i][1];
                
                if(row>=0 && row<n && col>=0 && col<m)
                {
                    if(a[row][col]==1 && visited[row][col]==false)
                    {
                        Pair p=new Pair(row,col,rem.time+1);
                        
                        visited[row][col]=true;
                        
                        que.add(p);
                        time=Math.max(p.time,time);
                    }
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(visited[i][j]==true)
                {
                   c++;
                }
            }
        }
        
        if(c!=count)
        return -1;
        
        return time;
    }
}
