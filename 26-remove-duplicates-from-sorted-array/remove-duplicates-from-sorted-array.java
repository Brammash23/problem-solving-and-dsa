class Solution {
    public int removeDuplicates(int[] nums) {

        int k=1,i=0,j=1;
        int length = nums.length;
        while(i<length && j<length)
        {
            if(nums[i] == nums[j])
            {
                j++;
            }
            else if(nums[j]>nums[i])
            {
                nums[++i]=nums[j++];
                k++;
            }
        }

        return k;
        
    }
}