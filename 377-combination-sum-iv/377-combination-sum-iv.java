class Solution {
    public int combinationSum4(int[] a, int target) {  
        int dp[]=new int[target+1];
        Arrays.fill(dp,-1);
       return combi(a,target,dp);
    }
    
    private int combi(int a[], int target, int dp[]){
        
        if(target==0){
            return 1;
        }
        
        if(dp[target]!=-1){
            return dp[target];
        }
        
        int count=0;
        for(int i=0;i<a.length;i++){
            if(target>=a[i]){
                int res=combi(a,target-a[i],dp);
                count+=res;
            }
        }
        return dp[target]=count;
    }
}