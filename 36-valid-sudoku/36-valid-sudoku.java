class Solution {
    public boolean isValidSudoku(char[][] a) {
        
        HashMap<Integer,HashSet<Character>>row=new HashMap<>();
        HashMap<Integer,HashSet<Character>>col=new HashMap<>();
        
        int n=a.length;
        
        for(int i=0;i<9;i++){
            row.put(i,new HashSet<>());
            col.put(i,new HashSet<>());
        }
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(a[i][j]!='.')
                {
                    //checking if the current element is already present in the row aur col
                    if(row.get(i).contains(a[i][j]) || col.get(j).contains(a[i][j])){
                        return false;
                    }
                    
                    //if not present we add it to the hashSet of the corresponding row and col
                    else{
                        row.get(i).add(a[i][j]);
                        col.get(j).add(a[i][j]);
                    }
                }
            }
        }
        
        return check(a);
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