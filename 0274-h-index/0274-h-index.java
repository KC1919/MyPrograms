class Solution {
    public int hIndex(int[] a) {
        
        int n=a.length;

        if(n==1)
            return a[0]==0?0:1;
        
        Arrays.sort(a);

        int hIndex=0;

        for(int i=0;i<n;i++){
            int val=i+a[i]-1;

            if(val<n && val>=0)
                hIndex=a[i];
            
            else
                hIndex=Math.max(hIndex,n-i);
        }
        return hIndex;
    }
}