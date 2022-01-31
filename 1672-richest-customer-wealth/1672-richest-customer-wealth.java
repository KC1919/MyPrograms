class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int max=0, i=0;
        
        while(i<accounts.length)
        {
            int cost=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                cost+=accounts[i][j];
            }
            if(cost>max)
                max=cost;
            
            i++;
        }
        
        return max;
    }
}