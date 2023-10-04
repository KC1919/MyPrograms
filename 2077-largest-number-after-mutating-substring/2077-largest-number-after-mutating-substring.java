class Solution {
    public String maximumNumber(String num, int[] change) {
        char[] nums = num.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - '0' < change[nums[i]-'0']) {
                for (int j = i; j < nums.length && nums[j]-'0' <= change[nums[j]-'0']; j++) {
                    nums[j] = (char) (change[nums[j]-'0'] + '0');
                }
                break;
            }
        }

        return new String(nums);
    }
}