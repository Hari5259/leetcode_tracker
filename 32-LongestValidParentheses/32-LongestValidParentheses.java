// Last updated: 7/9/2026, 11:36:46 AM
class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(-1); // base index for valid substring

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}
