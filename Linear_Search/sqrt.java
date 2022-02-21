import java.util.Scanner;

public class sqrt {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int x;
        System.out.println("Enter number:");
        x = in.nextInt();
        int n = solution(x);
        System.out.println(n);
    }

    static int solution(int x) 
    {
        //public int mySqrt(int x) {
            int sq =  (int)Math.sqrt(x);
            return sq;
    }
}

