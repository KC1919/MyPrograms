class Solution {
    public boolean exist(char[][] a, String word) {
        
        int n=a.length;
        int m=a[0].length;
        
        boolean visited[][]=new boolean[n][m];
        StringBuilder sb=new StringBuilder();
        
        int dir[][]={{1,0},{-1,0},{0,-1},{0,1}};
        
        char sc=word.charAt(0);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                //we only make calls from those cells whose character match
                //to the starting character of the word to be searched
                if(a[i][j]==sc){
                    sb.append(a[i][j]);
                    boolean res=findWord(a,i,j,n,m,visited,sb,word,dir);
                    sb.deleteCharAt(sb.length()-1);
                    
                    if(res==true)
                        return true;
                }
            }
        }
        return false;
    }
    public boolean findWord(char a[][], int i, int j, int n, int m, boolean visited[][], StringBuilder sb, String word, int dir[][])
        {
            if(sb.length()==word.length()){
                return true;
            }
            
            visited[i][j]=true;
            
            //searching in all 4 direction from the current cell
            for(int k=0;k<4;k++){
                int row=dir[k][0]+i;
                int col=dir[k][1]+j;
                
                //picking the character only if it is valid
                //means it is present in the word
                if(row>=0 && row<n && col>=0 && col<m && a[row][col]==word.charAt(sb.length()) && visited[row][col]==false)
                {
                    //pappend the character
                    sb.append(a[row][col]);
                    
                    //make call to search the next character in sequence of the word
                    boolean res=findWord(a,row,col,n,m,visited,sb,word,dir);
                    
                    //if the returned result is true, means the word was formed
                    //so we return true
                    if(res==true)
                        return true;
                    
                    //backtracking ,deleting the appended character
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        
            //marking the cell as unvisited
            visited[i][j]=false;
            return false;
        }
}