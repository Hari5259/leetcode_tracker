// Last updated: 9/14/2026, 6:57:06 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        Arrays.sort(candidates);
6
7        List<List<Integer>> result = new ArrayList<>();
8        List<Integer> current = new ArrayList<>();
9
10        backtrack(candidates, target, 0, current, result);
11
12        return result;
13    }
14
15    private void backtrack(
16            int[] candidates,
17            int target,
18            int start,
19            List<Integer> current,
20            List<List<Integer>> result) {
21
22        // Target reached
23        if (target == 0) {
24            result.add(new ArrayList<>(current));
25            return;
26        }
27
28        for (int i = start; i < candidates.length; i++) {
29
30            // Skip duplicate values at the same recursion level
31            if (i > start && candidates[i] == candidates[i - 1]) {
32                continue;
33            }
34
35            // Since the array is sorted, no later value can fit
36            if (candidates[i] > target) {
37                break;
38            }
39
40            // Choose the current candidate
41            current.add(candidates[i]);
42
43            // Move to i + 1 because each candidate
44            // can only be used once
45            backtrack(
46                candidates,
47                target - candidates[i],
48                i + 1,
49                current,
50                result
51            );
52
53            // Backtrack
54            current.remove(current.size() - 1);
55        }
56    }
57}