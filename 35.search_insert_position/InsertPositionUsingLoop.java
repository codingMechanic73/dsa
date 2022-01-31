class InsertPositionUsingLoop {
    
    public static int findInsertPosition(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        int midIndex = (startIndex + endIndex)/2;

        while(startIndex < endIndex) {
            midIndex = (startIndex + endIndex)/2;
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (target < nums[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return midIndex;
    }
}