class Solution {
    public int maximumProduct(int[] a) {
        
        Arrays.sort(a);
        int n=a.length;
        
        int prod=a[n-1]*a[n-2]*a[n-3];
        
        if(n==3){
            return prod;
        }
        
        int nprod=0;
        
        if(a[0]<0 && a[1]<0){
            nprod=a[0];
            nprod*=a[1];
            nprod*=a[n-1];
        }
        
        return Math.max(nprod,prod);
    }
}