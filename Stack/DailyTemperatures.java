/*
Problem: Daily Temperatures
Platform: LeetCode
Difficulty: Medium

Approach:
- Use a Monotonic Decreasing Stack to store indices.
- When a warmer temperature is found:
  - Pop indices from the stack.
  - Calculate the number of days waited.
- Store the result in an output array.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- Learned Monotonic Stack pattern.
- Learned how to solve Next Greater Element type problems.
- Learned efficient index-based stack processing.
*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                int prevIndex = st.pop();
                result[prevIndex] = i - prevIndex;
            }
            st.push(i);
        }

        return result;
        
    }
}