// Last updated: 7/13/2026, 9:55:07 AM
1class Solution {
2
3    public List<Integer> diffWaysToCompute(String expression) {
4
5        List<Integer> result = new ArrayList<>();
6
7        for (int i = 0; i < expression.length(); i++) {
8
9            char ch = expression.charAt(i);
10
11            if (ch == '+' || ch == '-' || ch == '*') {
12
13                List<Integer> left =
14                        diffWaysToCompute(expression.substring(0, i));
15
16                List<Integer> right =
17                        diffWaysToCompute(expression.substring(i + 1));
18
19                for (int l : left) {
20                    for (int r : right) {
21
22                        if (ch == '+')
23                            result.add(l + r);
24
25                        else if (ch == '-')
26                            result.add(l - r);
27
28                        else
29                            result.add(l * r);
30                    }
31                }
32            }
33        }
34
35        // Base Case: expression is only a number
36        if (result.size() == 0) {
37            result.add(Integer.parseInt(expression));
38        }
39
40        return result;
41    }
42}