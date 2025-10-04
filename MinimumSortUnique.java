
import java.util.Arrays;

public class MinimumSortUnique {
    public static int MinOperation(int[] nums){
        Arrays.sort(nums);
        int moves = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                moves += (nums[i-1] - nums[i]) +1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return moves;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,1,1,2};
        System.out.println(MinOperation(nums));
    }
}
