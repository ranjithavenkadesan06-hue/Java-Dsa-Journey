/*
Problem: Group Anagrams
Platform: LeetCode
Difficulty: Medium

Approach:
- Convert each string into a character array.
- Sort the characters to create a unique key.
- Store strings with the same sorted key in a HashMap.
- Return all grouped anagrams from the map.

Time Complexity: O(n * k log k)
  n = number of strings
  k = average length of each string

Space Complexity: O(n * k)
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}