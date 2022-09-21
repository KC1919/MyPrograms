class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] a) {
        
        int n=a.length;
        int dp[]=new int[n];
        dp[0]=a[0];
        
        int ans[]=new int[n];
        ans[0]=1;
        
        int len=1;
        
        for(int i=1;i<n;i++){
            
            int pos=findPos(dp,len-1,a[i]);
            
            if(pos==len){
                len++;
            }
            
            else{
                if(dp[pos]==a[i]){
                    pos++;
                    len=Math.max(len,pos+1);
                }
            }
            
            ans[i]=pos+1;
            dp[pos]=a[i];
        }
        
        return ans;
    }
    
    private int findPos(int a[], int high, int target){
        
        int l=0, h=high;
        
        while(l<=h){
            int mid=(l+h)/2;
            
            if(a[mid]==target){
                if(mid<h && a[mid+1]==target){
                    l=mid+1;
                }
                
                else{
                    return mid;
                }
            }
            
            else if(a[mid]<target){
                l=mid+1;
            }
            
            else if(a[mid]>target){
                h=mid-1;
            }
        }
        return l;
    }
}