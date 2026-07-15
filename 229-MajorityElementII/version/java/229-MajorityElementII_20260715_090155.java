// Last updated: 7/15/2026, 9:01:55 AM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3
4        int candidate1 = 0;
5        int candidate2 = 1; // different initial values
6        int count1 = 0;
7        int count2 = 0;
8
9        // Find potential candidates
10        for (int num : nums) {
11
12            if (num == candidate1) {
13                count1++;
14            } else if (num == candidate2) {
15                count2++;
16            } else if (count1 == 0) {
17                candidate1 = num;
18                count1 = 1;
19            } else if (count2 == 0) {
20                candidate2 = num;
21                count2 = 1;
22            } else {
23                count1--;
24                count2--;
25            }
26        }
27
28        // Verify the candidates
29        count1 = 0;
30        count2 = 0;
31
32        for (int num : nums) {
33            if (num == candidate1)
34                count1++;
35            else if (num == candidate2)
36                count2++;
37        }
38
39        List<Integer> ans = new ArrayList<>();
40
41        int limit = nums.length / 3;
42
43        if (count1 > limit)
44            ans.add(candidate1);
45
46        if (count2 > limit)
47            ans.add(candidate2);
48
49        return ans;
50    }
51}