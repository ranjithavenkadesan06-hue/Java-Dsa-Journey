/*
Problem: Majority Element
Platform: LeetCode
Difficulty: Easy

Approach:
- Sort the array.
- Since the majority element appears more than n/2 times,
  it will always occupy the middle position after sorting.
- Return nums[n/2].

Time Complexity: O(n log n)
Space Complexity: O(1) or O(log n) depending on sorting implementation.

Key Learning:
- Learned how sorting can simplify frequency-based problems.
- Learned the majority element property.
*/
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}