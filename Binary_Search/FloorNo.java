
import java.util.Arrays;
import java.util.Scanner;

//import javax.swing.text.html.StyleSheet;

public class FloorNo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size,target=12;
            System.out.println("Enter size of array");
            size = sc.nextInt();

            int[] num = new int[size];
            System.out.println("Enter elements");
            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }

            int[] ans = ceiling(num,target);
            System.out.println(Arrays.toString(ans));
        }
    }

    // greatest no. <= target

    static int[] ceiling(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return new int[] {arr[mid]};

            }
            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] {arr[end]};
    }
}

    

