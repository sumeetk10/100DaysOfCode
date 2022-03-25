public class sumofdigit {
    public static void main(String[] args) {
        int ans = digitsum(1356);
        System.out.println(ans);
    }

    static int digitsum(int n) {

        if(n == 0)
        return 0;

        return digitsum(n/10) + (n%10);
    }
}
