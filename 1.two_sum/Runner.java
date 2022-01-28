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
        
        int[] result = TwoSumBruteForce.findTwoSum(nums, target);
        System.out.println("Result is " + result[0] + " " + result[1]);
    }
}