public class sum {
    public static void main(String[] args) {
        
        int ans = sumofdigit(8);
        System.out.println(ans);
    }

    static int sumofdigit(int n) {
        int sum = 0;

        if(n == 0)
        return n;

        sum = n + sumofdigit(n-1);
        return sum;
    }
}
