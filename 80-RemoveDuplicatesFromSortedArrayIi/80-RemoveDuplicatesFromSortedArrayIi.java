// Last updated: 7/9/2026, 11:36:34 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;

        // If array size is <= 2, return size itself
        if (nums.length <= 2) {
            return nums.length;
        }

        for (int i = 2; i < nums.length; i++) {
            // Keep element only if it is not equal to nums[k-2]
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}