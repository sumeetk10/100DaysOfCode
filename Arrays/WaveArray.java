import java.util.Arrays;
import java.util.Scanner;

class wave{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Enter the size of array:");
        n = in.nextInt();
        
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        convertToWave(num);
    }

    static void convertToWave(int x[])
    {
        for (int i = 0; i < x.length-1; i=i+2) {  
                int temp = x[i];
                x[i] = x[i+1];
                x[i+1] = temp;
        }
            System.out.println(Arrays.toString(x));
        
    }
    
}