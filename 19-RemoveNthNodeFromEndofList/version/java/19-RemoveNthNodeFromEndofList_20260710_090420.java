// Last updated: 7/10/2026, 9:04:20 AM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3
4        int length = 0;
5        ListNode temp = head;
6
7        // Count nodes
8        while (temp != null) {
9            length++;
10            temp = temp.next;
11        }
12
13        // If first node should be deleted
14        if (length == n) {
15            return head.next;
16        }
17
18        int pos = length - n;
19
20        temp = head;
21
22        for (int i = 1; i < pos; i++) {
23            temp = temp.next;
24        }
25
26        temp.next = temp.next.next;
27
28        return head;
29    }
30}