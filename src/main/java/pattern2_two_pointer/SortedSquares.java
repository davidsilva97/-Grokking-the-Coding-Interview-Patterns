package pattern2_two_pointer;

import java.util.*;

public class SortedSquares {
    public List<Integer> sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int result = nums[i]*nums[i];
            list.add((result));
        }
        Collections.sort(list);
        return list;
        }

    public static void main(String[] args) {
        SortedSquares app = new SortedSquares();
        int[] arr1 = {-2, -1, 0, 2, 3};
        int[] arr2 = {-3, -1, 0, 1, 2};
        int[] arr3 = {-4,-1,0,3,10};
        int[] arr4 = {-7,-3,2,3,11};

        System.out.println(app.sortedSquares(arr1).toString());
        System.out.println(app.sortedSquares(arr2).toString());
        System.out.println(app.sortedSquares(arr3).toString());
        System.out.println(app.sortedSquares(arr4).toString());
    }
    }

