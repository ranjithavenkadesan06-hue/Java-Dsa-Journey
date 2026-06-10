/*
Problem: Valid Parentheses
Platform: LeetCode
Difficulty: Easy

Approach:
- Use a stack to store opening brackets.
- For every closing bracket:
  - Check if the stack is empty.
  - Pop the top element and verify it matches.
- Return true if the stack is empty at the end.

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='('||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty())
                return false;
                char ch=st.pop();
                if(c=='}'&&ch!='{')return false;
                if(c==')'&&ch!='(')return false;
                if(c==']'&&ch!='[')return false;
            }
        }
        return st.isEmpty();
        
    }
}