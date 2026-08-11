// Last updated: 8/11/2026, 4:00:49 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        return solve(nums, nums.length);
4    }
5
6    private List<List<Integer>> solve(int[] nums, int n) {
7        if (n == 1) {
8            List<List<Integer>> base = new ArrayList<>();
9            List<Integer> list = new ArrayList<>();
10            list.add(nums[0]);
11            base.add(list);
12            return base;
13        }
14
15        List<List<Integer>> previous = solve(nums, n - 1);
16        List<List<Integer>> res = new ArrayList<>();
17
18        int value = nums[n - 1];
19
20        for (List<Integer> permutation : previous) {
21            for (int i = 0; i <= permutation.size(); i++) {
22                List<Integer> current = new ArrayList<>();
23
24                for (int j = 0; j < i; j++) {
25                    current.add(permutation.get(j));
26                }
27
28                current.add(value);
29
30                for (int j = i; j < permutation.size(); j++) {
31                    current.add(permutation.get(j));
32                }
33
34                res.add(current);
35            }
36        }
37
38        return res;
39    }
40}