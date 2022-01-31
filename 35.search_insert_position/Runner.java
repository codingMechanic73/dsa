import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        System.out.println("Enter the array Elements");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
    
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        
        // System.out.println(InsertPositionUsingLoop.findInsertPosition(nums, target));

        System.out.println(InsertPositionUsingRecursion.findInsertPosition(nums, target, 0, nums.length-1));
    }
}