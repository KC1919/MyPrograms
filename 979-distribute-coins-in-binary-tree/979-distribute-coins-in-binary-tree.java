class Solution {
    int ans;
    public int distributeCoins(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode node) {
        if (node == null) 
            return 0;
        
        int lres = dfs(node.left);
        int rres = dfs(node.right);
        
        //this stores the steps required
        ans += Math.abs(lres) + Math.abs(rres);
        
        //this returns the required or excess coins to the parent depending on the
        //coins they have with them(excess or deficient)
        
        //we are doing -1 because 1 coin is needed for the current node
        //so whatever coins we have in total after getting the result from our
        //children, we take 1 coin for ourself and return rest of the coins to the
        //parent
        return node.val + lres + rres - 1;
    }
}