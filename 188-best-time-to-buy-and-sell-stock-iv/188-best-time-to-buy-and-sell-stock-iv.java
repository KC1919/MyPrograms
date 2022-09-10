// class Solution {
    
//     int max=Integer.MIN_VALUE;
//     public int maxProfit(int k, int[] a) {
//         max=Integer.MIN_VALUE;
        
//         findMax(a,0,k,'\0',0);
//         return max;
//     }
    
//     // Recursion
//     private void findMax(int a[], int idx, int k, char t, int sum){
        
//         if(idx==a.length || k==0){
            
//             max=Math.max(max,sum);
//             return;
//         }
        
//         if(idx==0 && k>0){
//             findMax(a,idx+1,k,'b',sum-a[idx]);
//             findMax(a,idx+1,k,t,sum);
//         }
        
//         else if(idx>0){
            
//             if(t=='b' && k>0){
//                 findMax(a,idx+1,k-1,'s',sum+a[idx]);
//                 findMax(a,idx+1,k,t,sum);
//             }
            
//             else if((t=='s' || t=='\0') && k>0){
//                 findMax(a,idx+1,k,'b',sum-a[idx]);
//                 findMax(a,idx+1,k,t,sum);
//             }
//         }
//     }
// }


class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length == 0)
            return 0;
        
        int n = prices.length, max;
        int[] prevLine = new int[n];
        int[] dp = new int[n];
        
        for(int i = 1; i <= k; i++){
            dp = new int[n];
			//max represents my maximum profit so far by making i-1 transactions
            max = - prices[0];
            for(int j = 1; j < n; j++){
                dp[j] = Math.max(dp[j-1], max + prices[j]);
                max = Math.max(max,  prevLine[j] - prices[j]);
            }
            prevLine = dp;
        }
        
        return dp[n-1];
    }
}