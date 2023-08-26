class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs, (a,b)-> a[1]-b[1] );

        // int dp[][]=new int[pairs.length][2];

        // dp[0]=pairs[0];
        // int max=1;
        // int len=1;
        
        // for(int i=1;i<pairs.length;i++){
            
        //     int pos=findPos(dp,len-1,pairs[i][0]);
            
        //     if(pos==len){
        //         len++;
        //         max=Math.max(len,max);
        //     }
            
        //     dp[pos]=pairs[i];
        // }

        // return max;

        int end = pairs[0][1];
        int res = 1;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > end) {
            res++;
            end = pairs[i][1];
            }
        }
        return res;
    }

    private int findPos(int a[][], int high, int target){
        
        int l=0, h=high;
        
        while(l<=h){
            int mid=(l+h)/2;
            
            if(a[mid][1]<target){
                l=mid+1;
            }
            
            else if(a[mid][1]>target){
                h=mid-1;
            }
            
            else{
                return mid;
            }
        }
        return l;
    }
}