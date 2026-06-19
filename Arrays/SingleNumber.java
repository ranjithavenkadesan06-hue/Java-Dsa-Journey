/*
Problem: Single Number
Platform: LeetCode
Difficulty: Easy

Approach:
- For each element, count its occurrences.
- Return the element that appears exactly once.

Time Complexity: O(n²)
Space Complexity: O(1)

Key Learning:
- Learned frequency-based searching.
- Brute-force approach to finding unique elements.
*/class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
        
    }
}