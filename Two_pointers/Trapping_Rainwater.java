/*
Problem: Trapping Rain Water
Platform: LeetCode
Difficulty: Hard

Approach:
- Create left and right maximum arrays.
- left[i] stores the maximum height from the left.
- right[i] stores the maximum height from the right.
- Water trapped at index i:
  min(left[i], right[i]) - height[i]
- Sum the trapped water at all indices.

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=height[0];
        right[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max+=Math.min(right[i],left[i])-height[i];
        }
        return max;
    }
}