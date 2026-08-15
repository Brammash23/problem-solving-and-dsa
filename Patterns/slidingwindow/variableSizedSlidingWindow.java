package slidingwindow;

public class variableSizedSlidingWindow {

    public static void main(String[] args) {
        int [] arr = {2,5,1,7,10};
        int left=0;
        int right =0;
        int length = arr.length;
        int sum = 0;
        int maxlen = 0;
        int k =14;
        int len=0;

        while(right < length)
        {
            sum+=arr[right];
            while (sum > k) {
                sum-=arr[left];
                left++;
            }

            if (sum<k)
            {
                maxlen = Math.max(maxlen,right-left+1);
                right++;
            }

        }

    }
}
