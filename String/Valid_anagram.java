/*
Problem: Valid Anagram
Platform: LeetCode 242 / NeetCode Arrays & Hashing
Difficulty: Easy

Time Complexity: O(n)
Space Complexity: O(k)
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>set=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(char c:s.toCharArray()){
            set.put(c,set.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!set.containsKey(c)) return false;
            set.put(c,set.get(c)-1);
            if(set.get(c)==0){
                set.remove(c);
            }
            
        }
        if(set.isEmpty()){
            return true;
        }
        
        return false;

    }
    }
    