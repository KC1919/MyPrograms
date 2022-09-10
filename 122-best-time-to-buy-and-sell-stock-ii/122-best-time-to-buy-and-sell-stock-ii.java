class Solution {
    public int maxProfit(int[] prices) {
        
        int sum=0;
        
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]<min){
                min=prices[i];
            }
            
            else{
                sum+=(prices[i]-min);
                min=prices[i];
            }
        }
        
        return sum;
    }
}