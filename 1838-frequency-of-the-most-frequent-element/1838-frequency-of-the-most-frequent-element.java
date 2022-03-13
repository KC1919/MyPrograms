class Solution {
    public int maxFrequency(int[] a, int k) {
        
        int res = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(a);
        for (j = 0; j < a.length; ++j) {
            sum += a[j];
            while (sum + k < (long)a[j] * (j - i + 1)) {
                sum -= a[i];
                i += 1;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}