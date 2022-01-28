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
        
        int[] resultUsingBruteForce = TwoSumBruteForce.findTwoSum(nums, target);
        System.out.println("Result using brute force is " + resultUsingBruteForce[0] + " " + resultUsingBruteForce[1]);

        int[] resultUsingSort = TwoSumUsingSort.findTwoSum(nums, target);
        System.out.println("Result using sorting is " + resultUsingSort[0] + " " + resultUsingSort[1]);
    
        int[] resultUsingMap = TwoSumUsingMap.findTwoSum(nums, target);
        System.out.println("Result using map is " + resultUsingMap[0] + " " + resultUsingMap[1]);
    }
}