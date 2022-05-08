class Solution {
    public boolean isValidSudoku(char[][] a) 
    {
        HashMap<Integer,HashSet<Character>>row=new HashMap<>();
        HashMap<Integer,HashSet<Character>>col=new HashMap<>();
        
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
                    if(row.get(i).contains(a[i][j]) || col.get(j).contains(a[i][j])){
                        return false;
                    }

                    else{
                        row.get(i).add(a[i][j]);
                        col.get(j).add(a[i][j]);
                    }
                }
            }
        }
        return checkSub(a,0,0);
    }
    
    //function to check if the subgrid of 3*3 is valid or not
    public boolean checkSub(char a[][], int row, int col)
    {
        HashSet<Character>hm=new HashSet<>();
        
        while(row<9 && col<9){
        
            for(int i=row;i<row+3;i++)
            {
                for(int j=col;j<col+3;j++)
                {
                    if(a[i][j]!='.')
                    {
                        if(hm.contains(a[i][j]))
                            return false;

                        hm.add(a[i][j]);
                    }
                }
            }
            hm.clear();
            col+=3;
            
            if(col==9){
                col=0;
                row+=3;
            }
        }
        return true;
    }
}