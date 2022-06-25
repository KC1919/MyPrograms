class Solution {
    public boolean checkPossibility(int[] nums) {
        var j = -1; // outlier index
        var n = nums.length;

        for (var i = 0; i + 1 < n; i++)
            if (nums[i] > nums[i + 1]) {
                if (j != -1) 
                    return false; // > 1 outlier, impossible
                j = i;
            }
        return j < 1
            || j == n - 2 
            || nums[j - 1] <= nums[j + 1]
            || nums[j] <= nums[j + 2];
    }
}