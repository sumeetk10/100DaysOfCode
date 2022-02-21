import java.util.*;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of array:");
        size = sc.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = sumElements(arr,size);

        System.out.println("Sum is "+ans);

    }
    
    static int sumElements(int x[],int n)
    {
       int sum=0;
       for (int i = 0; i < x.length; i++) {
           sum = sum + x[i];
       } 
       return sum;
    }
}
