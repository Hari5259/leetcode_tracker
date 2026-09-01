// Last updated: 9/1/2026, 9:34:42 AM
1class Solution {
2
3    int count = 0;
4
5    public int findTargetSumWays(int[] nums, int target) {
6
7        solve(nums, target, 0, 0);
8
9        return count;
10    }
11
12    public void solve(int[] nums, int target, int index, int sum) {
13
14        if(index == nums.length) {
15
16            if(sum == target) {
17                count++;
18            }
19
20            return;
21        }
22
23        solve(nums, target, index + 1, sum + nums[index]);
24
25        solve(nums, target, index + 1, sum - nums[index]);
26    }
27}