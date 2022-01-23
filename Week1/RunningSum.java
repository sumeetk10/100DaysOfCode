import java.util.Scanner;
import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter size:");
        n = sc.nextInt();

        int[] nums = new int[n];
        
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = runningSum(nums,n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int nums[], int n)
    {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
