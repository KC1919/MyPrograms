class Solution {
    public double findMaxAverage(int[] a, int k) {
        
        int sum=0;
        int count=0;
        int j=0;
        
        double max=-10001*1.0;
        
        System.out.println(max);
        
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            
            count+=1;
            
            while(j<=i && count>k){
                
                sum-=a[j];
                count--;
                j++;
            }
            
            if(count==k){
                double avg=(sum*1.0)/k;
                max=Math.max(avg,max);
            }
        }
        return max;
    }
}