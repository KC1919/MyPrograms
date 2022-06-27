class Solution {
    public int maxScore(int[] a, int k) {
        
        int sum=0;
        
        for(int ele:a){
            sum+=ele;
        }
        
        int n=a.length;
        
        if(k==n){
            return sum;
        }
        
        int win=n-k;
        
        int csum=0;
        
        int min=Integer.MAX_VALUE;
        
        int j=0;
        
        for(int i=0;i<n;i++){
            
            csum+=a[i];
            
            while((i-j+1)>win){
                csum-=a[j];
                j++;
            }
            
            if(i-j+1==win){
                min=Math.min(min,csum);
            }
        }
        return sum-min;
    }
}