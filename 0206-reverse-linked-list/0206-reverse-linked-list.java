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
    public ListNode reverseList(ListNode head) {
        if(head == null)
        return null;
        Stack<ListNode> s = new Stack<>();
        ListNode temp = head;
        while(temp!=null)
        {
            s.push(temp);
            temp = temp.next;
        }
        ListNode newHead = s.pop();
        ListNode current = newHead;
        while(!s.isEmpty())
        {
            current.next = s.pop();
            current = current.next;
        }
        current.next = null;
        return newHead;
    }
}