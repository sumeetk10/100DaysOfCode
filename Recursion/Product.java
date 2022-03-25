public class Product {
    public static void main(String[] args) {

        function1 p1 = new function1();
        System.out.println(p1.product(6));
    }
}

class function1 {
    int product(int n) {

        if(n == 1)
        return 1;

        int prod = n * product(n-1);
        return prod;
    }

}