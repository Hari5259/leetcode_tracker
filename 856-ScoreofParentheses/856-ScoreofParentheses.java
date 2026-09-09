// Last updated: 9/9/2026, 3:59:45 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Integer> st = new Stack<>();
4        int score = 0;
5        for(int i = 0; i < s.length(); i++){
6            char ch = s.charAt(i);
7            if(ch == '('){
8                st.push(score);
9                score = 0;
10            }
11            else {
12                score = st.pop() + Math.max(2 * score, 1);
13            }
14        }
15        return score;
16    }
17}