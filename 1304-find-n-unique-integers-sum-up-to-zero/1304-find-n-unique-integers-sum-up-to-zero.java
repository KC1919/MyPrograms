class Solution {
    public int[] sumZero(int n) {
        
        int a[]=new int[n];
        
        int limit;
        
        if(n%2!=0){
            limit=n-1;
        }
        
        else{
            limit=n;
        }
        
        int j=1;
        int i=0;
        
        while(i<limit){
            a[i++]=j;
            a[i++]=-j;
            j++;
        }
        
        return a;
    }
}