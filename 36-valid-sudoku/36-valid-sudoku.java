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
        return checkSub(a,0,0);
    }
    
    //function to check if the subgrid of 3*3 is valid or not
    public boolean checkSub(char a[][], int row, int col)
    {
        HashSet<Character>hm=new HashSet<>();
        
        // this runs till all the 3*3 subgrids are checked
        while(row<9 && col<9){
            
            //start from the 1st row of every subgrid
            for(int i=row;i<row+3;i++)
            {
                for(int j=col;j<col+3;j++) //start from the 1st row of every subgrid
                {
                    if(a[i][j]!='.')
                    {
                        if(hm.contains(a[i][j]))
                            return false;

                        hm.add(a[i][j]);
                    }
                }
            }
            hm.clear();//when we validate one subgrid we clear the hashmap, so that we                        //can process the next grid
            col+=3; //we jump 3 cols to reach the start column of new subgrid
            
            //if we exceed the column boundary, means we have to move to subgrid 
            //below
            if(col==9){
                col=0;  //so we initialize the column to 0 
                row+=3; //and we jump 3 rows becoz we have to jump to the subgrid below
            }
        }
        return true;
    }
}