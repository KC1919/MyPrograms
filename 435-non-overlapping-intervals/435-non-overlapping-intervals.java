class Solution {
    public int eraseOverlapIntervals(int[][] a) {
        
        Arrays.sort(a,(b,c)->{
            return b[1]-c[1];
        });
        
        int start=a[0][0];
        int end=a[0][1];
        
        int count=0;
        
        int dp[]=new int[a.length];
        
        for(int i=1;i<a.length;i++){
            
            if(a[i][0]<end){
                end=Math.max(end,a[i][1]);
                
                if(dp[i-1]==0){
                    dp[i]=1;
                }
                else if(dp[i-1]==1){
                    
                    int j=i-2;
                    while(j>=0){
                       if(dp[j]==0 && a[j][1]>a[i][0]){
                           dp[i]=1;
                           break;
                        }
                        j--;
                    }
                    
                }
            }
            else{
                start=a[i][0];
                end=a[i][1];
            }
        }
        
        for(int i=0;i<dp.length;i++){
            count+=dp[i];
        }
        
        return count;
    }
}