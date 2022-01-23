import java.util.Arrays;
import java.util.Scanner;

public class MatrixRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter size*size :");
        size = sc.nextInt();

        int[][] matrix = new int[size][size];
        System.out.println("Enter elements");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        rotate(matrix,size);
        System.out.println(Arrays.toString(matrix));
}
        static int[][] rotate(int[][] matrix, int n)
        {
           for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
               }
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
                }
            }
            return matrix;
        
        
    }
}    
