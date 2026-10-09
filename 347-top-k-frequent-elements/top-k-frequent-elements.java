class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> FrequentMap = new HashMap<>();

        for(int i=0;i<nums.length;i++) 
        { 
     
            FrequentMap.put(nums[i],FrequentMap.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> sorter =
        new PriorityQueue<>(
            (a, b) -> Integer.compare(
                FrequentMap.get(b),
                FrequentMap.get(a)
            )
        );

        sorter.addAll(FrequentMap.keySet());

        int[] topFrequent = new int[k];
        int m=0;

        while(k>0)
        {
            topFrequent[m++] = sorter.poll();
            k--;
        }

        return topFrequent;
                    
    }
}