/*
Problem: Jump Game
Platform: LeetCode
Difficulty: Medium

Approach:
- Maintain the farthest index that can be reached.
- If the current index is beyond the farthest reachable index,
  return false.
- Continuously update the farthest reachable position.
- If all indices are reachable, return true.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Learned greedy traversal.
- Learned how to track the maximum reachable position.
- Common greedy interview pattern.
*/
class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<i){
                return false;
            }
            max=Math.max(max,nums[i]+i);
        }
        return true;
    }
}