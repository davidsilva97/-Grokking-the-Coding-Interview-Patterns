package pattern1_slider_window;

public class MinimunSubArrayLen {
    public int minSubArrayLen(int target, int[] nums){
        int windowSum = 0;
        double minLength = Double.POSITIVE_INFINITY;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            windowSum += nums[windowEnd];

            while (windowSum >= target){
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum-= nums[windowStart];
                windowStart++;
            }
        }
            if(minLength == Double.POSITIVE_INFINITY){
                return 0;
            }

            return (int) minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int s1 = 7;

        int[] arr2 = {1,4,4};
        int s2 = 4;

        int[] arr3 = {1,1,1,1,1,1,1,1};
        int s3 = 11;
        MinimunSubArrayLen app = new MinimunSubArrayLen();
        System.out.println(app.minSubArrayLen(s1,arr));
        System.out.println(app.minSubArrayLen(s2,arr2));
        System.out.println(app.minSubArrayLen(s3,arr3));
    }

}
