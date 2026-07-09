// Last updated: 7/9/2026, 11:36:53 AM
class Solution {
    public int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = value(s.charAt(i));

            if (i + 1 < s.length() &&
                value(s.charAt(i)) < value(s.charAt(i + 1))) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }

        return sum;
    }

    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}