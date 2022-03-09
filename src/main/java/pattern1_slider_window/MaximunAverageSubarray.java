package pattern1_slider_window;

//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum
//average value and return this value. Any answer with a calculation error less
//than 10-5 will be accepted.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximunAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        //sliding window approach

        List<Double> results = new ArrayList<>();
        double maxValue = 0;
        double windowSum = 0;
        int windowStart = 0;

    for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
        windowSum += nums[windowEnd];

        if(windowEnd >= k-1){
            results.add(windowSum/k);
            windowSum-=nums[windowStart];
            windowStart++;
        }
    }
    //results.forEach(element -> System.out.println(element));
    maxValue = Collections.max(results);
    return maxValue;
    }

    public static void main(String[] args) {
        //Example 1:
        //
        //Input: nums = [1,12,-5,-6,50,3], k = 4
        //Output: 12.75000
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        //Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
        //Example 2:
        //Input: nums = [5], k = 1
        //Output: 5.00000
        int[] arr2 = {5};
        int k2 = 1;

        MaximunAverageSubarray app = new MaximunAverageSubarray();
        System.out.println(app.findMaxAverage(arr,k));
        System.out.println(app.findMaxAverage(arr2,k2));
    }
}
