/*
Problem: Merge Two Sorted Lists
Platform: LeetCode
Difficulty: Easy

Approach:
- Create a dummy node to simplify list construction.
- Compare nodes from both linked lists.
- Attach the smaller node to the result list.
- Append the remaining nodes after one list becomes empty.

Time Complexity: O(n + m)
Space Complexity: O(1)

Key Learning:
- Learned dummy node technique.
- Learned merging of sorted linked lists.
- Foundation for Merge Sort on Linked Lists.
*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null)temp.next=list1;
        if(list2!=null)temp.next=list2;
        return dummy.next;

    }
        
    }