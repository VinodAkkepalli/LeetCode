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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0, head);

        if(head.next == null) 
            return null;
        
        ListNode current = dummy;
        ListNode linkNode = dummy;

        for(int i=0; i<= n; i++) {
            current = current.next;
        }
        
        while(current != null) {
            current = current.next;
            linkNode = linkNode.next;
        }

        
        linkNode.next = linkNode.next.next;
        
        return dummy.next;
    }
}