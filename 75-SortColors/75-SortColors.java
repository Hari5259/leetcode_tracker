// Last updated: 8/8/2026, 8:56:30 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0, mid = 0, high = nums.length - 1;
4        
5        while (mid <= high) {
6            if (nums[mid] == 0) {
7                swap(nums, low, mid);
8                low++;
9                mid++;
10            } else if (nums[mid] == 1) {
11                mid++;
12            } else { // nums[mid] == 2
13                swap(nums, mid, high);
14                high--;
15                // don't increment mid — swapped-in value not yet checked
16            }
17        }
18    }
19    
20    private void swap(int[] nums, int i, int j) {
21        int temp = nums[i];
22        nums[i] = nums[j];
23        nums[j] = temp;
24    }
25}