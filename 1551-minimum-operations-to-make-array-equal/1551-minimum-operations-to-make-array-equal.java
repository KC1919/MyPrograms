class Solution {
    public int minOperations(int n) {
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=(2*i)+1;
        }
        
        int min=Integer.MAX_VALUE;
        
        int mid=n/2;
        
        if(n%2==0){
            mid-=1;
        }
        
        int res=minSteps(a,mid,n);
        min=Math.min(res,min);
        
        return min;
    }
    
    private int minSteps(int a[], int target, int n){
        
        int sum=0;
        for(int i=0;i<n;i++){
            if(i<target){
                sum+=Math.abs(a[target]-a[i]);
            }
        }
        
        if(n%2==0){
            sum=sum+((a[n-1]-a[target])/2);
        }
        
        return sum;
    }
}