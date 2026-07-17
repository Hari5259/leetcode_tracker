// Last updated: 7/17/2026, 11:42:56 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left <= right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] == target)
12                return true;
13
14            // Cannot determine the sorted half because of duplicates
15            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
16                left++;
17                right--;
18            }
19
20            // Left half is sorted
21            else if (nums[left] <= nums[mid]) {
22
23                if (nums[left] <= target && target < nums[mid])
24                    right = mid - 1;
25                else
26                    left = mid + 1;
27            }
28
29            // Right half is sorted
30            else {
31
32                if (nums[mid] < target && target <= nums[right])
33                    left = mid + 1;
34                else
35                    right = mid - 1;
36            }
37        }
38
39        return false;
40    }
41}