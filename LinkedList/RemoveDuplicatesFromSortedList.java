package codes.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution2 {
    public ListNode3 deleteDuplicates(ListNode3 head) {

        ListNode3 current = head;
        while(current != null && current.next != null) {
            if(current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) {
        val = x;
    }
}