class Solution {
    public int maxSubArray(int[] a) {
        
        int max=-10001;
        int sum=0;
        
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            max=Math.max(sum,max);
            
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}