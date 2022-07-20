class Solution {
    public int[] productExceptSelf(int[] a) {
        
        int n=a.length;
        int self[]=new int[n];
        
        int prod=1;
        for(int i=0;i<n;i++){
            self[i]=prod;
            prod*=a[i];
        }
        
        prod=1;
        for(int i=n-1;i>=0;i--){
            self[i]*=prod;
            prod*=a[i];
        }
        
        return self;
    }
}