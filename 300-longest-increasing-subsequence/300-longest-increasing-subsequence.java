class Solution {
    public int lengthOfLIS(int[] a) {
        
        if(a.length==1)
            return 1;
        
        int n=a.length;
        int dp[]=new int[n];
        
        //store the 1st element 
        dp[0]=a[0];
        
        //this stores the longest subsequence so far
        int len=1;
        
        //stat from the 2nd element
        for(int i=1;i<n;i++){
            
            //find the position of the element where it can be inserted into the dp array
            //we put the element at found insert position in the dp array
            int pos=findPos(dp,len-1,a[i]);
                dp[pos]=a[i];
            
            //if the position exceeds the current number of elements in the dp array, we increment the
            //number of elements by 1, which tells the longest increasing subsequence
            if(pos==len)
                len++;
        }
        return len;
    }
    
    
    //function to find the insert position
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