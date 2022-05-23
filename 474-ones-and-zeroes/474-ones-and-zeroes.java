class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] cache = new int[strs.length][m + 1][n + 1];
        return findMax(strs, 0, m, n, cache);
    }
    
    public int findMax(String[] strs, int i, int m, int n, int[][][] cache) {
        if (i == strs.length)
            return 0;
		
		if (cache[i][m][n] > 0)
            return cache[i][m][n];

        int zeros = 0;
        int ones = 0;
                
        for (char ch: strs[i].toCharArray()) {
            if (ch == '0')
                zeros++;
            else
                ones++;
        }
        
		int maxForms = 0;

        if (m - zeros >= 0 && n - ones >= 0)
            maxForms = Math.max(maxForms, 1 + findMax(strs, i + 1, m - zeros, n - ones, cache));
        
        maxForms = Math.max(maxForms, findMax(strs, i + 1, m, n, cache));
        
        return cache[i][m][n] = maxForms;
    }
}