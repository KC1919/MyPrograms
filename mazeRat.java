import java.util.*;
class mazeRat 
{
    static Scanner sc=new Scanner(System.in);
    
    static ArrayList<String> findPath(int[][] m) 
    {
        ArrayList<String> res=new ArrayList<>();
        boolean visited[][]=new boolean[m.length][m.length];
        solve(m,0,0,"",res,visited);
        return res;
    }
    
    static void solve(int m[][],int i,int j,String ans,ArrayList<String> res,boolean visited[][])
    {
        if(i>=m.length || j>=m.length || i<0 || j<0 || m[i][j]==0 || visited[i][j]==true) 
        {                            
                                            //base case, if the rat runs out of maze OR it reaches                                     
            return;                         //wrong cell i.e. m[i][j]==0, OR it has already visited that cell, then 
                                            //SIMPLY RETURN                   
        }
        
        if(i==m.length-1 && j==m.length-1)  //if it reaches the destination i.e. the last cell of the maze, then we add the travelled path(ans) to the
        {                                   //resultant(res) list.
            res.add(ans);
            return;                         //and return
        }
        
        visited[i][j]=true;                  //if we reach here, then we mark the cell as visited,  and make all possible moves from that cell
        
        solve(m,i+1,j,ans+"D",res,visited);  //downward move
        solve(m,i,j-1,ans+"L",res,visited);  //left move
        solve(m,i,j+1,ans+"R",res,visited);  //right move
        solve(m,i-1,j,ans+"U",res,visited);  //upside move
        
        visited[i][j]=false;                //when all possible moves have been explored then we unvisit the cell while returning from there,
    }                                      //so that it can be explored by other cell's moves...
    
    public static void main(String args[])
    {
        //System.out.println("enter maze size: ");
        //int n=sc.nextInt();
        
        
        int m[][] ={{1, 0, 0, 0},
                    {1, 1, 0, 1}, 
                    {1, 1, 0, 0},
                    {0, 1, 1, 1}};
        
        System.out.println(findPath(m));
    }
}
