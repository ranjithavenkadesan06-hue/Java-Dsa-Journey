/*
Problem: Reverse Linked List
Platform: LeetCode
Difficulty: Easy

Approach:
- Use three pointers:
  1. prev
  2. curr
  3. next
- Reverse the link direction one node at a time.
- Return the new head (prev).

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Learned in-place linked list reversal.
- Learned pointer manipulation techniques.
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
           
        }
        return prev;
        
    }
}