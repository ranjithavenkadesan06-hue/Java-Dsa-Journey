/*
Problem: Best Time to Buy and Sell Stock
Platform: LeetCode
Difficulty: Easy

Approach:
- Track the minimum stock price seen so far.
- Calculate profit for each day by selling at current price.
- Update maximum profit whenever a larger profit is found.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Learned how to maintain a running minimum.
- Learned optimization using a single traversal.
*/
class Solution {
    public int maxProfit(int[] prices) { 
        int min=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            
                int profit=prices[i]-min;
                if(profit>maxprofit){
                    maxprofit=profit;
            
            }
        } 
        return maxprofit;
    }            
}