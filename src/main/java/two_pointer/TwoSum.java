package two_pointer;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        Arrays.sort(nums);

        while(start<end){
            int currentSum = nums[start] + nums[end];

            if(currentSum == target){
                int[] result = {start,end};
                return result;
            }
            if (currentSum < target){
                start++;
            }else{
                end--;
            }
        }
        int[] notFound = {0};
        return notFound;
    }

    public static void main(String[] args) {
        TwoSum app = new TwoSum();
        int[] arr1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] arr2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] arr3 = {2, 7, 11, 15};
        int target3 = 9;
        System.out.println(Arrays.toString(app.twoSum(arr1,target1)));
        System.out.println(Arrays.toString(app.twoSum(arr2,target2)));
        System.out.println(Arrays.toString(app.twoSum(arr3,target3)));
    }
}
