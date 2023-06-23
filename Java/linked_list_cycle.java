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
        if (head == null) return false;
        int temp = 0;
        Set <Integer> set1 = new HashSet();
        while (head != null)
        {
            temp = System.identityHashCode(head);
            if (!set1.contains(temp))
            {
                set1.add(temp);
            }
            else return true;
            head = head.next;
        }
        return false;
    }
}