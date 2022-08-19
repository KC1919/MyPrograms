class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        boolean col[]=new boolean[n];
        boolean ldiag[]=new boolean[2*n-1];
        boolean rdiag[]=new boolean[2*n-1];
        
        List<List<String>>res=new ArrayList<>();
        
        placeQueen(n,0,0,col,ldiag,rdiag,res,new ArrayList<>());
        
        return res;
    }
    
    private void placeQueen(int n, int placed, int r, boolean col[], boolean ldiag[], boolean rdiag[], List<List<String>>res, List<Integer>list){
        
        if(placed==n){
            
            List<String>queens=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                
                int colu=list.get(i);
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){
                    if(j==colu)
                        sb.append('Q');
                    
                    else
                        sb.append('.');
                }
                
                queens.add(sb.toString());
            }
            
            res.add(new ArrayList<>(queens));
            
            return;
        }
        
        for(int j=0;j<n;j++){
            
            if(col[j]==false && ldiag[r+j]==false && rdiag[r-j+n-1]==false){
                col[j]=true;
                ldiag[r+j]=true;
                rdiag[r-j+n-1]=true;
                list.add(j);
                
                placeQueen(n,placed+1,r+1,col,ldiag,rdiag,res,list);
                
                col[j]=false;
                ldiag[r+j]=false;
                rdiag[r-j+n-1]=false;
                list.remove(list.size()-1);
            }   
        }
    }
    
}