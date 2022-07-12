/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        do {
            if (slowPointer == null || fastPointer == null || fastPointer.next == null) {
                return false;
            } 
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        } while (slowPointer != fastPointer);
        
        return true;
    }
}