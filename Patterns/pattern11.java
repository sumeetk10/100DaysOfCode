//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

public class pattern11 {
    public static void main(String[] args) {
   
        Pattern p1 = new Pattern();
        p1.inversetriangle();
    }
}

class Pattern {
    void inversetriangle() {
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j2 = 0; j2 < 5-i; j2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
}
