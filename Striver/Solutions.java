public class Solutions {

     public boolean check(int[] nums) {
        int drop=0;
        int length = nums.length;
       for(int i=0;i<length;i++)
       {
        if(nums[i] > nums[(i+1)%length])
              drop++;
        }
       return drop<=1;
    };

    public boolean checkString(String s) {
        int length = s.length();
        int aIndex=0;
        int bIndex=0;

        for(int i=0;i<length;i++)
        {
            if(s.charAt(i) == 'a')
            {
                aIndex++;
            }

           if(s.charAt(i) == 'a' && bIndex>0)
            {
              return false;
            }

            if(s.charAt(i) == 'b')
            {
                bIndex++;
            }   
        }
        return true;
        
    };
    
}
