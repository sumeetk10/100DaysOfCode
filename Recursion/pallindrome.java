public class pallindrome {
    public static void main(String[] args) {
        palin(1357);
        System.out.println(sum);
    }

    static int sum = 0;
    static void reverse(int n) {

        if(n == 0)
        return;

        int rem = n%10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }

    static boolean palin(int n) {
        return n == reverse(n);
    }
}
