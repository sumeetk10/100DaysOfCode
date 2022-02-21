import java.util.Scanner;

public class TransitionPoint {
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

        int ans = transitionPoint(arr,size);
        System.out.println("Transition at "+ans);

    }

    static int transitionPoint(int[] x, int n)
    {
       
       for (int i = 0; i < n; i++) {
           if (x[i]>0) {
               return i;
               
           }
       } 
       return -1;
    }
}
