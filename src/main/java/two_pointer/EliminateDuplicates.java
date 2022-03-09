package two_pointer;

import java.util.Set;
import java.util.TreeSet;

public class EliminateDuplicates {
    public int removeDuplicates(int[] nums) {
        Set<Integer> list = new TreeSet<>();
        for(int elemento: nums){
            list.add(elemento);
        }
        return list.size();
    }

    public static void main(String[] args) {
        EliminateDuplicates app = new EliminateDuplicates();
        int[] arr1 = {2, 3, 3, 3, 6, 9, 9};
        int[] arr2 = {2, 2, 2, 11};
        int[] arr3 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(app.removeDuplicates(arr1));
        System.out.println(app.removeDuplicates(arr2));
        System.out.println(app.removeDuplicates(arr3));
    }
}
