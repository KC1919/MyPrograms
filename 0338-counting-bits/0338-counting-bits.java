class Solution {
    public int[] countBits(int n) {
        
        int dp[]=new int[n+1];

        for(int i=1;i<=n;i++){

            if(dp[i]!=0){
                continue;
            }
            dp[i]=calculateBit(i);
        }
        return dp;
    }

    public int calculateBit(int n){

        int rem=0;
        int count=0;
        
        while(n>1){
            rem=n%2;
            count+=rem==1?1:0;
            n=n/2;
        }
        return count+1;
    }
}