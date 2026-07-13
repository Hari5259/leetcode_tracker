// Last updated: 7/13/2026, 9:53:57 AM
1public class Solution {
2    public boolean hasCycle(ListNode head) {
3
4        ListNode slow = head;
5        ListNode fast = head;
6
7        while (fast != null && fast.next != null) {
8
9            slow = slow.next;          // Move 1 step
10            fast = fast.next.next;     // Move 2 steps
11
12            if (slow == fast) {
13                return true;
14            }
15        }
16
17        return false;
18    }
19}