public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int hammingWeight = 0;
        while (n != 0) {
            if (n < 0) {
                hammingWeight += 1;
            }
            n = n << 1;
        }
        
        return hammingWeight;
    }
}