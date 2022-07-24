class Solution {
    public int minOperations(int n) {
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=(2*i)+1;
        }
        
        int min=Integer.MAX_VALUE;
        
        if(n%2==0){
            int res1=minSteps(a,n/2);
            int res2=minSteps(a,n/2-1);
            min=Math.min(res1,res2);
        }
        
        else{
            int res1=minSteps(a,n/2);
            min=Math.min(res1,min);
        }
        
        return min;
    }
    
    private int minSteps(int a[], int target){
        
        int sum=0;
        for(int i=0;i<a.length;i++){
            
            if(i!=target){
                sum+=Math.abs(a[target]-a[i]);
            }
        }
        return sum/2;
    }
}