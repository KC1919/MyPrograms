class Solution {
    public int lengthOfLIS(int[] a) {
        
        int n=a.length;
        int dp[]=new int[n];
        
        dp[0]=a[0];
        
        int len=1;
        
        for(int i=1;i<n;i++){
            
            int pos=findPos(dp,0,len-1,a[i]);
            
            if(pos==len){
                len++;
            }
            dp[pos]=a[i];
        }
        return len;
    }
    
    private int findPos(int a[], int l, int h, int target){
        
        int mid=-1;
        
        while(l<=h){
            mid=(l+h)/2;
            
            if(a[mid]==target)
                return mid;
            
            else if(a[mid]<target){
                l=mid+1;
            }
            
            else{
                h=mid-1;
            }
        }
        
        return l;
    }
}