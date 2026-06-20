/*
Problem: Gas Station
Platform: LeetCode
Difficulty: Medium

Approach:
- Calculate net gas gain/loss at each station.
- Track total tank and current tank.
- If current tank becomes negative, the current start
  point cannot complete the circuit.
- Reset start to the next station.
- If total gas is sufficient, return the valid start index.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Learned greedy strategy.
- Learned how to identify a valid starting point in a circular route.
*/
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tottank=0;
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            tottank+=diff;
            tank+=diff;
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        return (tottank>=0)?start:-1;
    
    }
}