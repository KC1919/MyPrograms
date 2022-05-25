class Solution {
    public int lengthOfLIS(int[] a) {
        
        if(a.length==1)
            return 1;
        
        int n=a.length;
        int dp[]=new int[n];
        
        //answer of last element would always be 1, because there are 
        // no elements right to it so it cannot make any subsequence
        dp[0]=a[0];
        
        //this stores the longest subsequence so far
        int len=1;
        
        for(int i=1;i<n;i++){
            
            int pos=findPos(dp,len-1,a[i]);
                dp[pos]=a[i];
                
            if(pos==len)
                len++;
        }
        return len;
    }
    
    private int findPos(int a[], int high, int target){
        
        int l=0, h=high;
        int mid=-1;
        
        while(l<=h){
            mid=(l+h)/2;
            
            if(a[mid]<target)
                l=mid+1;
                
            else if(a[mid]>target)
                h=mid-1;
                
            else
                return mid;
        }
        
        return l;
    }
}