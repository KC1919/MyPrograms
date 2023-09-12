class Solution {
    public int maxProfit(int[] prices) {
        
        int sum=0;
        
        // Approach 1
        
//         int min=Integer.MAX_VALUE;
        
//         for(int i=0;i<prices.length;i++){
            
//             if(prices[i]<min){
//                 min=prices[i];
//             }
            
//             else{
//                 sum+=(prices[i]-min);
//                 min=prices[i];
//             }
//         }
        
        // Approach 2
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                sum+=prices[i]-prices[i-1];
            }
        }
        
        return sum;
    }
}