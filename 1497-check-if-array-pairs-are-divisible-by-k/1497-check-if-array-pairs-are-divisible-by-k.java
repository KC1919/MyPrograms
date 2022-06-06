class Solution {
    public boolean canArrange(int[] a, int k) {
        
        if(a.length%2!=0)
        return false;
        
        int rem[]=new int[k];
        
        for(int i=0;i<a.length;i++){
            
            //if the value is negative, then this will get the positive remainder 
            int remainder=(a[i]%k+k)%k;
            
            //incrementing the count of remainder
            rem[remainder]++;
        }

        for(int i=1;i<=k/2;i++){
            if(i==k-i&&rem[i]%2==1)return false;
            if(rem[i]!=rem[k-i])return false;
        }
        return true;
    }
}