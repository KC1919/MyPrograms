class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashMap<Integer,HashSet<Integer>>row=new HashMap<>();
        HashMap<Integer,HashSet<Integer>>col=new HashMap<>();
        
        int n=board.length;
        
        for(int i=0;i<n;i++){
            
            row.put(i,new HashSet<>());
            
            for(int j=0;j<n;j++){
                
                if(board[i][j]=='.')
                    continue;
        
                int ele=board[i][j]-48;
                
                if(row.get(i).contains(ele))
                    return false;
                
                row.get(i).add(ele);
                
                if(col.containsKey(j) && col.get(j).contains(ele))
                    return false;

                if(!col.containsKey(j))
                    col.put(j,new HashSet<>());
                
                col.get(j).add(ele);
            }
        }
        
        return check(board);
    }
    
    private boolean check(char board[][]){
        
        HashSet<Character>hm=new HashSet<>();
        
        int row=0, col=0;
        
        while(row<9){
            
            for(int i=row;i<row+3;i++){
                
                for(int j=col;j<col+3;j++){
                    
                    if(board[i][j]!='.'){
                        
                        if(hm.contains(board[i][j])){
                            return false;
                        }

                        hm.add(board[i][j]);
                    }
                }
            }
            
            hm.clear();
            col+=3;
            
            if(col==9){
                row+=3;
                col=0;
            }
        }
        
        return true;
    }
}