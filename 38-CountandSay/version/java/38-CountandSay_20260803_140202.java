// Last updated: 8/3/2026, 2:02:02 PM
1class Solution {
2    public String countAndSay(int n) {
3        
4        String result = "1";
5        
6        for (int k = 2; k <= n; k++) {
7            
8            StringBuilder next = new StringBuilder();
9            int i = 0;
10            
11            while (i < result.length()) {
12                
13                char ch = result.charAt(i);
14                int count = 0;
15                
16                while (i < result.length() && result.charAt(i) == ch) {
17                    count++;
18                    i++;
19                }
20                
21                next.append(count);
22                next.append(ch);
23            }
24            
25            result = next.toString();
26        }
27        
28        return result;
29    }
30}