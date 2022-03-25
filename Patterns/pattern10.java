//          *
//         * *
//        * * *
//       * * * *
//      * * * * *

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row;
            System.out.println("Enter no. of rows:");
            row = sc.nextInt();
            pattern(row);
        }
    }

    static void pattern(int n) {
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
