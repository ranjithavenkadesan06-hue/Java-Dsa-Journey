/*
Problem: Max Consecutive Ones
Platform: LeetCode
Difficulty: Easy

Approach:
- Traverse the array and count consecutive 1s.
- Reset the count when a 0 is encountered.
- Track the maximum count throughout the traversal.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxcount=Math.max(count,maxcount);
            }
            else{
                
                count=0;

            }
        }
        return maxcount;
    }
}