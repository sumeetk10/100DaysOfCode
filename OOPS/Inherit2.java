
class Arithmetic {
    int add(int x, int y) {
        int sum=0;
        sum = x + y;
        return sum;
    }    
}

class Adder extends Arithmetic {
    
}
public class Inherit2{
    public static void main(String []args){
        
        Adder a = new Adder();
        
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	

        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}


