class Solution {
    public boolean increasingTriplet(int[] nums) {
        var low = Integer.MAX_VALUE;
        var mid = Integer.MAX_VALUE;

        for (var num : nums)
            if (num <= low)
                low = num;
            else if (num <= mid)
                mid = num;
            else
                return true;

        return false;
    }
}