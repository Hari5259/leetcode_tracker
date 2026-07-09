// Last updated: 7/9/2026, 11:36:01 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long ans = 0;
        long count = 0;

        for (int num : nums) {

            if (num == 0) {
                count++;
                ans += count;
            } else {
                count = 0;
            }
        }

        return ans;
    }
}