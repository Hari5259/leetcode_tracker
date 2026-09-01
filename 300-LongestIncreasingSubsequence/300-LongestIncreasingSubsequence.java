// Last updated: 9/1/2026, 9:35:39 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3
4        int n = nums.length;
5
6        int[] dp = new int[n];
7
8        for(int i = 0; i < n; i++) {
9            dp[i] = 1;
10        }
11
12        for(int i = 1; i < n; i++) {
13
14            for(int j = 0; j < i; j++) {
15
16                if(nums[j] < nums[i]) {
17
18                    dp[i] = Math.max(dp[i], dp[j] + 1);
19
20                }
21            }
22        }
23
24        int ans = 0;
25
26        for(int i = 0; i < n; i++) {
27            ans = Math.max(ans, dp[i]);
28        }
29
30        return ans;
31    }
32}