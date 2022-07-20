class Solution {
    public boolean exist(char[][] a, String word) {
        
        int n=a.length;
        int m=a[0].length;
        
        boolean visited[][]=new boolean[n][m];
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                if(word.charAt(0)==a[i][j] && visited[i][j]==false){
                                    
                    boolean res=search(a,1,i,j,word,visited,dir,1);
                    if(res){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean search(char a[][], int idx, int i, int j, String word, boolean visited[][], int dir[][], int count){
        
        if(count==word.length()){
            return true;
        }
        
        visited[i][j]=true;
        
        for(int k=0;k<4;k++){
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && col>=0 && row<a.length && col<a[0].length && visited[row][col]==false && a[row][col]==word.charAt(idx))
            {
                boolean res=search(a,idx+1,row,col,word,visited,dir,count+1);   
                if(res){
                    return true;
                }
            }
        }
        
        visited[i][j]=false;
        return false;
    }
}