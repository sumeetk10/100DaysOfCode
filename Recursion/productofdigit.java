public class productofdigit {
    public static void main(String[] args) {
        int ans = digitproduct(146);
        System.out.println(ans);
    }
    
    static int digitproduct(int n) {

        if(n%10 == n) 
        return n;

        return digitproduct(n/10) * (n%10);
    }
}
