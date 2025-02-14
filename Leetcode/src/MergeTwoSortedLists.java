/**
 * (21) Merge Two Sorted Lists
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes
 * of the first two lists
 *
 * Example:
 * Input: 1 -> 2 -> 4,  1 -> 3 -> 4
 * Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
 *
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 * Easy level
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        // compare the values and merge
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }
    }
}
