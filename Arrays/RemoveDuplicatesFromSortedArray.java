/*
Problem: Remove Duplicates from Sorted Array
Platform: LeetCode
Difficulty: Easy

Approach:
- Use two pointers.
- Keep track of the position for the next unique element.
- Copy unique elements forward and return the count.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Learned the two-pointer technique.
- Learned in-place array modification.
*/class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
       int k=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[k]=nums[i];
            k++;
        }
       }
       return k;
        
    }
}