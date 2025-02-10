/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head; // No need to reverse if k == 1

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            ListNode kthNode = getKthNode(prevGroupEnd, k);
            if (kthNode == null) break; // If less than k nodes left, stop

            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kthNode.next;
            
            // Reverse the k nodes
            reverse(groupStart, k);
            
            // Connect the reversed group with previous and next parts
            prevGroupEnd.next = kthNode;
            groupStart.next = nextGroupStart;

            // Move to the next group
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode start, int k) {
        while (start != null && k > 0) {
            start = start.next;
            k--;
        }
        return start;
    }

    private void reverse(ListNode start, int k) {
        ListNode prev = null;
        ListNode curr = start;
        while (k > 0) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            k--;
        }
    }
}