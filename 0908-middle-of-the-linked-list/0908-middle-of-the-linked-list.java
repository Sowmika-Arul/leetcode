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
    public ListNode middleNode(ListNode head) {
        int c = 0;
        if(head.next == null)
        return head;
        ListNode temp = head;
        while(temp.next!=null)
        {
            c++;
            temp = temp.next;
        }
        int k = (c+1)/2;
        while(k>0)
        {
          head = head.next;
          k--;
        }
        return head;
    }
}