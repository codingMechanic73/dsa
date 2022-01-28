import java.util.Map;
import java.util.HashMap;

/**
Time Complexity: O(N)
Space Complexity: O(N)
 */
public class TwoSumUsingMap {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> bucket = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            if (bucket.containsKey(nums[i])) {
                return new int[]{bucket.get(nums[i]), i};
            } else {
                int diff = target - nums[i];
                bucket.put(diff, i);
            }
        }
        return new int[]{};
    }
}