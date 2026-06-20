/*
Problem: Happy Number
Platform: LeetCode
Difficulty: Easy

Approach:
- Repeatedly replace the number with the sum of the squares of its digits.
- A happy number eventually reaches 1.
- Any unhappy number eventually enters a cycle containing 4.
- Stop when n becomes 1 or 4.

Time Complexity: O(log n)
Space Complexity: O(1)

Key Learning:
- Learned digit extraction using modulo and division.
- Learned cycle detection through mathematical properties.
*/
class Solution {
    public boolean isHappy(int n) {
        while(n!=1&&n!=4){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum=sum+d*d;
                n=n/10;
            }
            n=sum;
        }
        return n==1;

    }
}