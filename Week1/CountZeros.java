import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.print("Enter size:");
        size = sc.nextInt();

        int[] arr = new int[size];
        int count = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]==0) {
                count++;
                
            }
            else
            {
                continue;
            }
        }
        System.out.print("No. of Zeros: "+count);
    }
    
}
