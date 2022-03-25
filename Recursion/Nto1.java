public class Nto1 {
    public static void main(String[] args) {
        
        series(8);
    }

    static int series(int n) {

        if(n<1)
        return n;

        System.out.println(n);
        return series(n-1);
    }
}
