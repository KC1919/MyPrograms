class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        int totalCost=0;
        int curr=-1, prev=cost[n-2], next=cost[n-1];
        for(int i=n-3;i>=0;i--){
            curr=Math.min(next,prev)+cost[i];
            next=prev;
            prev=curr;
        }

        return Math.min(prev,next);
    }
}