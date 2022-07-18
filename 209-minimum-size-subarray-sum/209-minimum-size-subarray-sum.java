class Solution {
    public int minSubArrayLen(int target, int[] a) {
        
        int j=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        
        for(int i=0;i<a.length;i++){
            
            sum+=a[i];
            
            if(sum>=target){
                min=Math.min(min,i-j+1);
            }
            
            while(j<=i && sum>=target){
                sum-=a[j];
                
                j++;
                
                if(sum>=target){
                    min=Math.min(min,i-j+1);
                }
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}