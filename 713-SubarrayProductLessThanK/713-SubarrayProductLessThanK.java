// Last updated: 7/9/2026, 11:36:03 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            long prod = 1;

            for (int j = i; j < nums.length; j++) {

                prod *= nums[j];

                if (prod < k) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}