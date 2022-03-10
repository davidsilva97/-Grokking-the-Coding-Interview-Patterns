package pattern2_two_pointer;

import java.util.Arrays;

public class DutchNationalFlag {
    public void sortColors(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j<(nums.length-i);j++){
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        DutchNationalFlag app = new DutchNationalFlag();
        int[] arr1 = {1, 0, 2, 1, 0};
        int[] arr2 = {2, 2, 0, 1, 2, 0};
        app.sortColors(arr1);
        app.sortColors(arr2);
    }
}
