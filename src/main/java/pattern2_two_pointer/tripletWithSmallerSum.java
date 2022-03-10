package pattern2_two_pointer;

import java.util.Arrays;

public class tripletWithSmallerSum {
    public int tripletSum(int[] arr, int target){
        Arrays.sort(arr);
        int count = 0;
        tripletWithSmallerSum functionPair = new tripletWithSmallerSum();
        for(int i = 0; i < arr.length - 2; i++){
            count += functionPair.searchPair(arr,target-arr[i],i);
        }
        return count;
    }

    public int searchPair(int[] arr, int targetSum,int first){

        int count = 0;
        int start = first + 1;
        int end = arr.length -1;

        while(start<end){
            if(arr[start] + arr[end] < targetSum){
                //we found the a triplet
                //since arr[end] >= arr[start], therefore, we can replace arr[end]
                //by any number between start and end to get a sum less than the targetSum
                count += end - start;
                start++;
            }else{
                //we need a pair with a smaller sum
                end--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        tripletWithSmallerSum app = new tripletWithSmallerSum();
        int[] arr1 = {-1, 0, 2, 3};
        int target1 = 3;
        int[] arr2 = {-1, 4, 2, 1, 3};
        int target2 = 5;
        int[] arr3 = {-2,0,1,3};
        int target3 = 2;
        int[] arr4 = {};
        int target4 = 0;

        System.out.println(app.tripletSum(arr1,target1));
        System.out.println(app.tripletSum(arr2,target2));
        System.out.println(app.tripletSum(arr3,target3));
        System.out.println(app.tripletSum(arr4,target4));


    }
}
