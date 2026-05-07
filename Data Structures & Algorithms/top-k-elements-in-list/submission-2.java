class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for(int i=0;i<k;i++)
            result[i]= entries.get(i).getKey();
        return result; 
    }
}

// public int[] topKFrequentBrute(int[] nums, int k) {
//     Map<Integer, Integer> freq = new HashMap<>();
//     for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);

//     List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
//     entries.sort((a, b) -> b.getValue() - a.getValue());

//     int[] result = new int[k];
//     for (int i = 0; i < k; i++) result[i] = entries.get(i).getKey();
//     return result;
// }


// Bucket Sort: values are frequencies 1..n, so create n+1 buckets
// public int[] topKFrequentBucket(int[] nums, int k) {
//     Map<Integer, Integer> freq = new HashMap<>();
//     for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);

//     int n = nums.length;
//     List<Integer>[] buckets = new ArrayList[n + 1];
//     for (int i = 1; i <= n; i++) buckets[i] = new ArrayList<>();

//     for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
//         buckets[e.getValue()].add(e.getKey());
//     }

//     int[] result = new int[k];
//     int idx = 0;
//     for (int f = n; f >= 1 && idx < k; f--) {
//         for (int num : buckets[f]) {
//             result[idx++] = num;
//             if (idx == k) break;
//         }
//     }
//     return result;
// }

// // Min-Heap approach (O(n log k))
// public int[] topKFrequentHeap(int[] nums, int k) {
//     Map<Integer, Integer> freq = new HashMap<>();
//     for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);

//     PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
//         new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

//     for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
//         minHeap.offer(e);
//         if (minHeap.size() > k) minHeap.poll();
//     }

//     int[] result = new int[k];
//     for (int i = k - 1; i >= 0; i--) result[i] = minHeap.poll().getKey();
//     return result;
// }
