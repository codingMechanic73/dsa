class InsertPositionUsingRecursion {
    
    public static int findInsertPosition(int[] nums, int target, int startIndex,int endIndex) {
        int midIndex = (startIndex + endIndex) / 2;
        if (nums[midIndex] == target) {
            return midIndex;
        } else if (startIndex >= endIndex) {
            return midIndex + 1;
        } else if (target < nums[midIndex]) {
            return findInsertPosition(nums, target, startIndex, midIndex - 1);
        } else {
            return findInsertPosition(nums, target, midIndex + 1, endIndex);
        }
    }
}