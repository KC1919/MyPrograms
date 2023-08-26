class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs, (a,b)->{
            return a[0]-b[0];
        });

        int n=pairs.length;

        int dp[]=new int[n];

        dp[0]=1;

        for(int i=1;i<n;i++){

            int max=0;

            for(int j=0;j<i;j++){
                if(pairs[i][0]>pairs[j][1]){
                    max=Math.max(dp[j],max);
                }
            }

            max+=1;
            dp[i]=max;
        }

        return dp[n-1];
    }
}