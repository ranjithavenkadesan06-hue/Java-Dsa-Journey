/*
Problem: Top K Frequent Elements
Platform: LeetCode
Difficulty: Medium

Approach:
- Count the frequency of each element using a HashMap.
- Use a Max Heap (PriorityQueue) to store elements based on frequency.
- Extract the top k frequent elements from the heap.

Time Complexity: O(n log n)
Space Complexity: O(n)

Key Learning:
- Learned frequency counting using HashMap.
- Learned custom comparator in PriorityQueue.
- Learned Heap-based Top-K pattern.
*/class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>heap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int key:map.keySet()){
            heap.offer(key);
        }
        int a[]=new int[k];
        for(int i=0;i<k;i++){
            a[i]=heap.poll();
        }
        return a;
    }
}
