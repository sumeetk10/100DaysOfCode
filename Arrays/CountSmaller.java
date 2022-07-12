package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class CountSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the size");
        size = sc.nextInt();

        int[] nums;
        nums = new int[size];
        System.out.println("Enter elements:");
        for (int i : nums) {
            nums[i] = sc.nextInt();
            i++;
        }  
        int[] ans = new int[nums.length];
        for (int i = 0; i <= size-1 ; i++) {
            
            int count = 0;
            for (int j = 0; j < size-1; j++) {
                if (nums[i]> nums[j+1]) {
                    count ++;
                } else {
                    continue;
                }
            }
            ans[i] = count;
            
        }
        System.out.print(Arrays.toString(ans));
    }
}
