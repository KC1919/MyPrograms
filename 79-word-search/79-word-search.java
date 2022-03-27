class Solution {
    public boolean exist(char[][] a, String word) 
    {
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        boolean visited[][]=new boolean[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==word.charAt(0))
                    if(find(a,i,j,visited,1,word,dir)==true)
                        return true;
            }
        }
        return false;
    }
    
    public boolean find(char a[][], int i, int j, boolean visited[][], int count, String word, int dir[][])
    {
        if(count==word.length())
            return true;
        
        visited[i][j]=true;
        for(int k=0;k<dir.length;k++)
        {
            int r=dir[k][0]+i;
            int c=dir[k][1]+j;
            
            if(r<a.length && r>=0 && c<a[0].length && c>=0 && visited[r][c]==false && a[r][c]==word.charAt(count))
            {
                boolean res=find(a,r,c,visited,count+1,word,dir);
                if(res==true)
                    return true;
            }
        }
        visited[i][j]=false;
        return false;
    }
}