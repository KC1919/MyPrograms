// class Solution {
    
//     int max=Integer.MIN_VALUE;
//     public int maxProfit(int k, int[] a) {
//         max=Integer.MIN_VALUE;
        
//         findMax(a,0,k,'\0',0);
//         return max;
//     }

        //RECURSION
    
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
        
        int n = prices.length;
        int cap = k; // no of transactions allowed
        int buy = 1; // can buy or not
        Integer[][][] dp = new Integer[n][2][k+1];
        return maxProfit(0, buy, cap, prices, n, dp);
    }
    
    private int maxProfit(int i, int buy, int cap, int[] prices, int n, Integer[][][] dp){
        
        if(i == n || cap == 0) return 0;
        
        if(dp[i][buy][cap] != null) return dp[i][buy][cap];
        // if can buy new stack else sell
        if(buy == 1){
            return dp[i][buy][cap] = Math.max(-prices[i] + maxProfit(i+1, 0, cap, prices, n, dp)
                             , 0 + maxProfit(i+1, 1, cap, prices, n, dp));                     
        }
        else{
            return dp[i][buy][cap] = Math.max(prices[i] + maxProfit(i+1, 1, cap-1, prices, n, dp)
                             , 0 + maxProfit(i+1, 0, cap, prices, n, dp));
        }
    }
}