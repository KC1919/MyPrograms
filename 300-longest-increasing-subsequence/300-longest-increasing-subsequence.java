class Solution {
    public int lengthOfLIS(int[] a) {
        
        int dp[]=new int[a.length];
        
        dp[0]=a[0];
        int max=1;
        int len=1;
        
        for(int i=1;i<a.length;i++){
            
            int pos=findPos(dp,len-1,a[i]);
            
            if(pos==len){
                len++;
            }
            
            max=Math.max(len,max);
            dp[pos]=a[i];
        }
        
        return max;
    }
    
    private int findPos(int a[], int high, int target){
        
        int l=0, h=high;
        
        while(l<=h){
            int mid=(l+h)/2;
            
            if(a[mid]<target){
                l=mid+1;
            }
            
            else if(a[mid]>target){
                h=mid-1;
            }
            
            else{
                return mid;
            }
        }
        return l;
    }
}