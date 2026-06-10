/*
Problem: Two Sum II - Input Array Is Sorted
Platform: LeetCode
Difficulty: Medium

Approach:
- Use two nested loops to check every pair.
- If the sum equals the target, return the 1-based indices.

Time Complexity: O(n²)
Space Complexity: O(1)
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int i=0;
    int j=i+1;
    for(i=0;i<numbers.length;i++){
        for(j=i+1;j<numbers.length;j++){
            if((numbers[i]+numbers[j])==target){
                return new int[]{i+1,j+1};
            }
        }
        
        
    }
    return new int[]{};
        
    }
}