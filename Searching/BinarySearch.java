/*
Problem: Binary Search
Platform: LeetCode
Difficulty: Easy

Approach:
- Maintain start and end pointers.
- Find middle element.
- If target is found, return its index.
- Search left or right half accordingly.

Time Complexity: O(log n)
Space Complexity: O(1)

Key Learning:
- Learned divide-and-conquer searching.
- Learned overflow-safe midpoint calculation.
- Foundation for advanced binary search problems.
*/
class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
               
            }
        }
        return -1;
        
    }
}