// Last updated: 7/30/2026, 9:28:29 AM
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode temp = head;

        // Count nodes
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // If first node should be deleted
        if (length == n) {
            return head.next;
        }

        int pos = length - n;

        temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}