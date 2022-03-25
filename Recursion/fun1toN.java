public class fun1toN {
    public static void main(String[] args) {
        
        forwardseries(8);
    }

    static void forwardseries(int n) {
        if(n == 0)
        return;

        forwardseries(n-1);
        System.out.println(n);

    }
}
