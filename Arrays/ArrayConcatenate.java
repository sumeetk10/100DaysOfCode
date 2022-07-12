package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter size:");
        n = sc.nextInt();

        int[] nums = new int[n];
        //int[] ans = new int[2*n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans1 = solution(nums,n);
        System.out.println(Arrays.toString(ans1));
    }

    static int[] solution(int nums[], int n)
    {
        int[] ans = new int[2*nums.length];
            for(int i=0; i<nums.length; i++)
            {
                ans[i] = nums[i];
                    
            }
                
            for(int i=0; i<nums.length; i++)
            {
               ans[i+nums.length] = nums[i];
            }
            return ans;
    }
        
    
}
