    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter no. of rows");
            int row = sc.nextInt();

            doubletriangle(row);
        }
        

    }

    static void doubletriangle(int n) {
        for (int i = 0; i < n; i++) {
         
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
    
            for (int j2 = 0; j2 < n-i; j2++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }

            for (int j2 = 0; j2 < i+1; j2++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
