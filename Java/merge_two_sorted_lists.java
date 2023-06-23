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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode new_list = new ListNode();
        ListNode head = new_list;
        while (list1 != null && list2 != null)
        {
            if (list1.val <= list2.val)
            {
                new_list.next = list1;
                list1 = list1.next;
            }
            else
            {
                new_list.next = list2;
                list2 = list2.next;
            }
            new_list = new_list.next;
        }
        if (list1 != null) new_list.next = list1;
        else if (list2 != null) new_list.next = list2;
        return head.next;
    }
}