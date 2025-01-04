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
    public ListNode deleteMiddle(ListNode head) {
       ListNode fast  = head;
       ListNode slow = head;
       ListNode temp = null;
       if(head == null || head.next == null)
       return null;
       while(fast!=null && fast.next!=null)
       {
        temp = slow;
        slow = slow.next;
        fast = fast.next.next;
       }
       //if(temp!=null && temp.next!=null)
       temp.next = temp.next.next;
       return head;
    }
}