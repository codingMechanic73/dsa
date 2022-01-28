import java.util.Arrays;

/**
Time Complexity: O(nLogn)
Space Comlexity: O(nLogn)
 */
public class TwoSumUsingSort {
    public static int[] findTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (nums[startIndex] + nums[endIndex] != target && startIndex < endIndex) {
            int sum = nums[startIndex] + nums[endIndex];

            if (sum > target) {
                endIndex--;
            } else {
                startIndex++;
            }
        }
        return new int[]{startIndex, endIndex};
    }
}