class Solution {
    public int minOperations(int[] a, int x) {
        
        long tsum=0;
        
        for(int ele:a)
            tsum+=ele;
        
        int n=a.length;
        
        long target=tsum-x;
        
        if(target<0)
            return -1;
        
        long sum=0;
        int min=Integer.MAX_VALUE;
        int j=0;
        
        for(int i=0;i<n;i++){
            
            sum+=a[i];
            
            while(sum>target){
                
                sum-=a[j];
                j++;
            }
            
            if(sum==target){
                min=Math.min(min,a.length-(i-j+1));
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}