// Last updated: 9/7/2026, 11:48:54 AM
1import java.util.*;
2
3class Solution {
4    public boolean checkSubarraySum(int[] nums, int k) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        // remainder 0 exists before the array starts
9        map.put(0, -1);
10
11        int sum = 0;
12
13        for (int i = 0; i < nums.length; i++) {
14
15            sum += nums[i];
16
17            int rem = sum % k;
18
19            if (map.containsKey(rem)) {
20
21                int previousIndex = map.get(rem);
22
23                if (i - previousIndex >= 2) {
24                    return true;
25                }
26
27            } else {
28                // Store only the first occurrence
29                map.put(rem, i);
30            }
31        }
32
33        return false;
34    }
35}