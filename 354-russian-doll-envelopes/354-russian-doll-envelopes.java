class Solution {
    
    class Pair
    {
        int width;
        int height;
        
        Pair(int width, int height){
            this.width=width;
            this.height=height;
        }
    }
    public int maxEnvelopes(int[][] envlop) {
        
        int n=envlop.length;
        Pair a[]=new Pair[n];
        
        for(int i=0;i<n;i++){
            a[i]=new Pair(envlop[i][0],envlop[i][1]);
        }
        
        Arrays.sort(a,(b,c)->{
            
            if(b.width==c.width)
                return c.height-b.height;
            
            else
                return b.width-c.width;
        });
        
        return lengthOfLIS(a);
    }
    
    private int lengthOfLIS(Pair[] a) {
        
        if(a.length==1)
            return 1;
        
        int n=a.length;
        int dp[]=new int[n];
        
        //answer of last element would always be 1, because there are 
        // no elements right to it so it cannot make any subsequence
        dp[0]=a[0].height;
        
        //this stores the longest subsequence so far
        int len=1;
        
        for(int i=1;i<n;i++){
            
            int pos=findPos(dp,len-1,a[i].height);
                dp[pos]=a[i].height;
                
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