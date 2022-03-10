package pattern2_two_pointer;

import java.util.ArrayList;
import java.util.List;

public class EliminateKeyElements {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<nums.length;i++){
            if(nums[i] != val){
                list.add(nums[i]);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        EliminateKeyElements app = new EliminateKeyElements();
        int[] arr1 = {3, 2, 3, 6, 3, 10, 9, 3};
        int key =3;
        int[] arr2 = {2, 11, 2, 2, 1};
        int key2 = 2;
        int[] arr3 = {3,2,2,3};
        int key3 = 3;
        int[] arr4 = {0,1,2,2,3,0,4,2};
        int key4 = 2;
        System.out.println(app.removeElement(arr1,key));
        System.out.println(app.removeElement(arr2,key2));
        System.out.println(app.removeElement(arr3,key3));
        System.out.println(app.removeElement(arr4,key4));
    }
}
