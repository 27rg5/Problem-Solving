# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        next_node = None
        prev_node = None
        node = head
        while (node != None):
            next_node = node.next
            node.next = prev_node
            prev_node = node
            node = next_node
            
        curr = prev_node

        return curr