// Last updated: 8/31/2026, 2:17:27 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3
4        List<Integer> ans = new ArrayList<>();
5
6        for(int i = 0; i < nums.length; i++) {
7
8            int index = Math.abs(nums[i]) - 1;
9
10            if(nums[index] < 0) {
11                ans.add(index + 1);
12            }
13            else {
14                nums[index] = -nums[index];
15            }
16        }
17
18        return ans;
19    }
20}
21