/*
Problem: Check if Array Is Sorted and Rotated
Platform: LeetCode
Difficulty: Easy

Approach:
- Traverse the array and count the number of places where
  nums[i] > nums[(i + 1) % n].
- Use modulo to compare the last element with the first element.
- A sorted and rotated array can have at most one such violation.
- Return true if count <= 1.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Learned circular array traversal using modulo.
- Learned how to identify sorted and rotated arrays.
- Learned pattern-based array validation.
*/
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}