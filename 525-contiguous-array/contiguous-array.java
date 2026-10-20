class Solution {
    public int findMaxLength(int[] nums) {
        Map <Integer,Integer> IndexMap = new HashMap<>();
        int sum=0;
        int max=0;
        IndexMap.put(0, -1);

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0) 
            {
                sum+=-1;
            }
            else 
            {
                sum+=1;
            }

            if(IndexMap.containsKey(sum))
            {
               max=Math.max(max,i-IndexMap.get(sum));
            }
            else
            {
                IndexMap.put(sum,i);
            }          
        }
                    return max;

        
    }
}