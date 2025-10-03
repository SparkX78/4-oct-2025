import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= current[1]){
                current[1] = Math.max(current[1], intervals[i][1]);
            }
            else{
                result.add(current);
                current = intervals[i];
            }


        }
        result.add(current);
        return result.toArray(new int[result.size() -1][]);
    }
    
    public static void main(String[] args) {
        MergeSort sol = new MergeSort();

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] merged = sol.merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
   
    

