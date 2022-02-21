import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class Maximum {
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

        int max = findMaximum(arr,size);
        System.out.println("Maximum element "+max);
    }
    
    static int findMaximum(int x[], int n)
    {
        int max=x[0];
        for (int i = 0; i < n; i++) {
            if (x[i]>max) {
                max=x[i];
            }
        }
        return max;
    }
}


