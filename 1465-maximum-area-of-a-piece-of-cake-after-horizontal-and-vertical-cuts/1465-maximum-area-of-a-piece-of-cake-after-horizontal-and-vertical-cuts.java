class Solution {
    int MOD = 1000000007;
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        Arrays.sort(hc);
        Arrays.sort(vc);
        
        long mh=maxDist(w, vc);
        long mw=maxDist(h, hc);
        return  (int) ((mh*mw) % MOD);
        
    }
    long maxDist(int d, int[] arr) 
    {
        long lastCut=0;
        long max=0;
        for(int ele:arr) {
            max=Math.max(max, ele-lastCut);
            lastCut=ele;
        }
        max=Math.max(max, d-lastCut);
        return max;
    }
}