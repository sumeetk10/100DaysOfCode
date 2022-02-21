import java.util.Arrays;
import java.util.Scanner;

public class Segregate {
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

        int[] ans = segregate0and1(arr,size);
        System.out.println(Arrays.toString(ans));
    }

    static int[] segregate0and1(int[] x,int n)
    {
        for (int i = 0; i < x.length-1; i++) {
            for (int j = 0; j < x.length-1; j++) {
                
             if (x[j]>0) {
                int temp = x[j];
                x[j] = x[j+1];
                x[j+1]= temp;
                
            }
            else
            {
                continue;
            }
        }  
            
    }
        return x;
    }
    
}
