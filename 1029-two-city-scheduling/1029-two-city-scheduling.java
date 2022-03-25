class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length; // number of people
        int[][] memo = new int[(n/2) + 1][(n/2) + 1]; // n/2 is capacity of each city
        return dfs(n - 1, n / 2, n / 2, costs, memo);
    }
    
    int dfs(int index, int num_a, int num_b, int[][] costs, int[][] memo) {
        // terminate
        if (index < 0) {
            return 0;
        }
        
        if (memo[num_a][num_b] > 0) return memo[num_a][num_b];

        int[] currCosts = costs[index];
        int ans = 0;
        
        // constraints
        if (num_a == 0) {
            ans = currCosts[1] + dfs(index - 1, num_a, num_b - 1, costs, memo); 
        } else if (num_b == 0) {
            ans = currCosts[0] + dfs(index - 1, num_a - 1, num_b, costs, memo);
        } else {
            int min_b = currCosts[1] + dfs(index - 1, num_a, num_b - 1, costs, memo);
            int min_a = currCosts[0] + dfs(index - 1, num_a - 1, num_b, costs, memo);
            ans = Math.min(min_b, min_a);
        }
        
        memo[num_a][num_b] = ans;
        return memo[num_a][num_b];
    }
    
    
    
}