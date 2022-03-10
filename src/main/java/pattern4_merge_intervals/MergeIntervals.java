package pattern4_merge_intervals;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 1){
            return intervals;
        }

        //Sort array
        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);
        //Define stack
        Stack<int[]> stack = new Stack<>();

        //add first interval into the stack
        stack.add(intervals[0]);

        //merge intervals
        for (int i = 1; i < n; i++){
            int[] previous = stack.peek();
            int[] current = intervals[i];

            //check they are overlapping
            if (previous[1] < current[0]){
                stack.add(current);
            }else{
                previous[1] = Math.max(current[1],previous[1]);
            }
        }
        return stack.toArray(new int[stack.size()][2]);
    }
}
