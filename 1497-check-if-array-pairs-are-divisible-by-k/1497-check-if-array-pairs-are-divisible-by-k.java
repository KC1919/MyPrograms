class Solution {
    public boolean canArrange(int[] a, int k) {
        
        if(a.length%2!=0)
        return false;
        
        int rem[]=new int[k];
        
        for(int i=0;i<a.length;i++){
            int idx=(a[i]%k+k)%k;
            rem[idx]++;
        }

        for(int i=1;i<=k/2;i++){
            if(i==k-i&&rem[i]%2==1)return false;
            if(rem[i]!=rem[k-i])return false;
        }
        return true;
    }
}