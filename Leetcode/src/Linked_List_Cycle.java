/**
 * (141) Linked List Cycle
 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position
 * (O-indexed) in the linked list where tail connects to. if pos is -1, then there is no cycle in the linked list
 *
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *
 * Example 2:
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 *
 * Example 3:
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list
 *
 * Follow up:
 * Can you solve it without using extra space O(1)?
 *
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 *
 * Easy level
 *
 */
public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head){

        // create two pointers: slow and fast
        ListNode slow = head;
        ListNode fast = head;

        // detect fast pointer if fast. next is null, return false
        while(fast != null && fast.next != null && fast.next.next != null){
            // if fast. next is not null , continue to detect if it has a cycle or not
            slow = slow.next;
            fast = fast.next.next;
            if(fast.val == slow.val)
                return ture;    // exist a cycle
        }
        return false;
    }
}
