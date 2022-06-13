class Solution {
    public int minimumTotal(List<List<Integer>> triad) {
        
        Integer dp[][]=new Integer[triad.size()][];
        
        for(int i=0;i<triad.size();i++){
            dp[i]=new Integer[triad.get(i).size()];
        }
        
        minpath(triad,0,0,dp);
        return dp[0][0];
    }
    
    private int minpath(List<List<Integer>>triad, int row, int j, Integer dp[][]){
        
        if(j==triad.get(row).size()){
            return Integer.MAX_VALUE;
        }
        
        if(row==triad.size()-1){
            return dp[row][j]=triad.get(row).get(j);
        }
        
        if(dp[row][j]!=null){
            return dp[row][j];
        }
        
        int min=Integer.MAX_VALUE;
        
        int dres=minpath(triad,row+1,j,dp);
        int rres=minpath(triad,row+1,j+1,dp);
        
        min=Math.min(min,Math.min(dres,rres));
        
        dp[row][j]=min+triad.get(row).get(j);
        return dp[row][j];
    }
}