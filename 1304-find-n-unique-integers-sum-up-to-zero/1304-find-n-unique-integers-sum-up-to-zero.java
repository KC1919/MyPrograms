class Solution {
    public int[] sumZero(int n) {
        
        int a[]=new int[n];
        
        for (int i = 0; i < n; ++i) {
            a[i] = i * 2 - n + 1;
        }
        return a;
    }
}