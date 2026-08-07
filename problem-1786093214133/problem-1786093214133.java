// Last updated: 8/7/2026, 2:30:14 PM
1class Solution {
2
3    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
4
5        ListNode dummy = new ListNode(-1);
6        ListNode curr = dummy;
7
8        while (list1 != null && list2 != null) {
9
10            if (list1.val <= list2.val) {
11                curr.next = list1;
12                list1 = list1.next;
13            } else {
14                curr.next = list2;
15                list2 = list2.next;
16            }
17
18            curr = curr.next;
19        }
20
21        if (list1 != null)
22            curr.next = list1;
23
24        if (list2 != null)
25            curr.next = list2;
26
27        return dummy.next;
28    }
29}